package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl;
import java.util.Hashtable;

import br.unicamp.ic.sed.cosmos.*;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IAlbum;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IFilesystem;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IMobileResources;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IPhoto;

class Manager extends AManagerComposite implements IManager {


	public Manager() {
		requiredInterfaces = new Hashtable();
		providedInterfaces= new Hashtable();
		internalComponents = new Hashtable();

		// setting provided interfaces		
		this.setProvidedInterface("IMobilePhone", new IMobilePhoneFacade(this));
		
		// setting required interfaces
		this.setRequiredInterfaceType("IMobileResources", IMobileResources.class);
		this.setRequiredInterfaceType("IPhoto", IPhoto.class);
		this.setRequiredInterfaceType("IFilesystem", IFilesystem.class);
		this.setRequiredInterfaceType("IAlbum", IAlbum.class);
		
		
		// getting all IManager from the internal components
		IManager mobilePhoneController = br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.impl.ComponentFactory.createInstance();
		IManager connMobPh_ExcHand = br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionshandler_mobilephonemgr.impl.ComponentFactory.createInstance();
		IManager warningEHIManager = br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionhandler.impl.ComponentFactory.createInstance();
		
		this.setInternalComponent("mobilephonecontroller", mobilePhoneController);
		this.setInternalComponent("warningexceptionhandler", warningEHIManager);
		this.setInternalComponent("warningexceptionshandler_mobilephonemgr", connMobPh_ExcHand);
		
		// setting internal connections
		mobilePhoneController.setRequiredInterface("IExceptionsHandlerCtr",connMobPh_ExcHand.getProvidedInterface("IExceptionsHandlerCtr"));
		connMobPh_ExcHand.setRequiredInterface("IExceptionsHandlerCtr", warningEHIManager.getProvidedInterface("IExceptionsHandlerCtr"));
		
		// setting mobilephonecontroller's required interfaces
		mobilePhoneController.setRequiredInterface("IPhotoCtr",new IAdapterPhoto());
		mobilePhoneController.setRequiredInterface("IFilesystemCtr",new IAdapterFilesystem());
		mobilePhoneController.setRequiredInterface("IMobileResourcesCtr",new IAdapterMobileResources());
		mobilePhoneController.setRequiredInterface("IAlbumCtr",new IAdapterAlbum());
		
		
		System.out.println("******************---"+this);
		
		
		// setting connector warningexceptionshandler_mobilephonemgr's required interface
		connMobPh_ExcHand.setRequiredInterface("IExceptionsHandlerCtr", warningEHIManager.getProvidedInterface("IExceptionsHandlerCtr"));
		
		//setting WarningExceptionHandler's required interfaces		
		warningEHIManager.setRequiredInterface("IMobileResources", new IAdapterMobileResourcesWEH(this));
		
		System.out.println("Saindo do mobilephonemgr.Manager");

		
	}

}
