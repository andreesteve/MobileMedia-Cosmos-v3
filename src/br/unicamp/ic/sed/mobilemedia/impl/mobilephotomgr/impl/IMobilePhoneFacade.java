package br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.impl;

import javax.microedition.lcdui.Command;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.impl.mobilephonecontroller.spec.prov.IMobilePhoneCtr;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.spec.prov.IMobilePhone;
import br.unicamp.ic.sed.cosmos.IManager;

class IMobilePhoneFacade implements IMobilePhone {

	private Manager mgr;

	private IMobilePhoneCtr imobile;

	public IMobilePhoneFacade(Manager manager) {
		
		System.out.println("construtor do IMobilePhoneFacade");
		if(manager == null)
			System.err.println("manager is null");
		
		this.mgr = manager;
		
		// get br.unicamp.ic.sed.cosmos.IManager of the mobilephonecontroller
		br.unicamp.ic.sed.cosmos.IManager imanager = this.mgr.getInternalComponent("mobilephonecontroller");
		if(imanager == null)
			System.err.println("br.unicamp.ic.sed.cosmos.IManager is null");
		else
			System.err.println("imanager is not null");
		
		//get IMobilePhone of the mobilephonecontroller
		this.imobile =	(IMobilePhoneCtr) imanager.getProvidedInterface("IMobilePhoneCtr");
		if(imobile == null)
			System.err.println("imobile is null");
		
	}


	public void postCommand(Command comand) {


		imobile.postCommand(comand);

	}



	public void startUp() {
		System.out.println("br.unicamp.ic.sed.mobilemedia.mobilephonemgr.IMobilePhoneFacade");
		System.out.println("Starting MobilePhone...");
		if(imobile == null)
			System.err.println("Composite component was not correctly initiated.");
		imobile.startUp();

	}

}
