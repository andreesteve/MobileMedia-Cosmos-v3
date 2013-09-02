package br.unicamp.ic.sed.mobilemedia.impl.main.impl;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import br.unicamp.ic.sed.cosmos.AManager;
import br.unicamp.ic.sed.cosmos.IManager;
import br.unicamp.ic.sed.mobilemedia.impl.main.spec.prov.IMobileResources;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.prov.IMobilePhone;


//Following are pre-processor statements to include the required
//classes for device specific features. They must be commented out
//if they aren't used, otherwise it will throw exceptions trying to
//load classes that aren't available for a given platform.


/* 
 * @author trevor
 *
 * This is the main Midlet class for the core J2ME application
 * It contains all the basic functionality that should be executable
 * in any standard J2ME device that supports MIDP 1.0 or higher. 
 * Any additional J2ME features for this application that are dependent
 * upon a particular device (ie. optional or proprietary library) are
 * de-coupled from the core application so they can be conditionally included
 * depending on the target platform 
 * 
 * This Application provides a basic Photo Album interface that allows a user to view
 * images on their mobile device. 
 * */
class MainUIMidlet extends MIDlet implements IMobileResources {

	//br.unicamp.ic.sed.cosmos.IManager album;
	
	//br.unicamp.ic.sed.cosmos.IManager filesystem;
	//br.unicamp.ic.sed.cosmos.IManager album_mobilePhone;
	//br.unicamp.ic.sed.cosmos.IManager filesystem_mobilePhone;
	
	//br.unicamp.ic.sed.cosmos.IManager photo;
	//br.unicamp.ic.sed.cosmos.IManager photo_mobilePhone;
	
//	br.unicamp.ic.sed.cosmos.IManager mainMidlet_album;
//	br.unicamp.ic.sed.cosmos.IManager mainMidlet_photo;
//	br.unicamp.ic.sed.cosmos.IManager mainmidlet_mobilephone;
//	
	//subcomponents
	//br.unicamp.ic.sed.cosmos.IManager mobilePhone;
	//br.unicamp.ic.sed.cosmos.IManager mobilePhone2;
	/*br.unicamp.ic.sed.cosmos.IManager excepHandler_mobilePhone;
	br.unicamp.ic.sed.cosmos.IManager excepHandler; 
	br.unicamp.ic.sed.cosmos.IManager mobilePhoneControl;
	*/
	public MainUIMidlet() {
	    //do nothing
	}

	/**
	 * Start the MIDlet by creating new model and controller classes, and
	 * initialize them as necessary
	 */
	public void startApp() throws MIDletStateChangeException {
		
		System.out.println("Starting MobileMediaOO - v1");
		
		// create all imanagers
//		filesystem = br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr.impl.ComponentFactory.createInstance();
//		album_mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.album_mobilephonemgr.impl.ComponentFactory.createInstance();
//		mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.ComponentFactory.createInstance();
//		
//		filesystem_mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr_mobilephonemgr.impl.ComponentFactory.createInstance();
//		album = br.unicamp.ic.sed.mobilemedia.impl.album.impl.ComponentFactory.createInstance();
		
//		mainMidlet_album = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_album.impl.ComponentFactory.createInstance();
//		photo = br.unicamp.ic.sed.mobilemedia.impl.photo.impl.ComponentFactory.createInstance();
//		
//		photo_mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.photo_mobilephonemgr.impl.ComponentFactory.createInstance();
//		mainMidlet_photo = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_photo.impl.ComponentFactory.createInstance();
//		
//		mainmidlet_mobilephone = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_mobilephonemgr.impl.ComponentFactory.createInstance();
//		
		/*Setting required interfaces*/
		
		/*MobilePhoneMgr*/
//		mobilePhone.setRequiredInterface("IFilesystem", filesystem_mobilePhone.getProvidedInterface("IFilesystem"));
//		
//		mobilePhone.setRequiredInterface("IMobileResources", mainmidlet_mobilephone.getProvidedInterface("IMobileResources") );
//		
//		mobilePhone.setRequiredInterface("IPhoto", photo_mobilePhone.getProvidedInterface("IPhoto"));
//
//		mobilePhone.setRequiredInterface("IAlbum", album_mobilePhone.getProvidedInterface("IAlbum"));
//		
//		/*Album*/
//		album.setRequiredInterface("IMobilePhone", album_mobilePhone.getProvidedInterface("IMobilePhone"));
//		
//		album.setRequiredInterface("IMobileResources", mainMidlet_album.getProvidedInterface("IMobileResources") );
//		
//		/*Photo*/
//		photo.setRequiredInterface("IMobilePhone", photo_mobilePhone.getProvidedInterface("IMobilePhone"));
//		
//		photo.setRequiredInterface("IMobileResources", mainMidlet_photo.getProvidedInterface("IMobileResources") );
//		
//		/*connectors*/
//		filesystem_mobilePhone.setRequiredInterface("IFilesystem", filesystem.getProvidedInterface("IFilesystem"));
//		
//		album_mobilePhone.setRequiredInterface("IAlbum", album.getProvidedInterface("IAlbum"));
//	
//		album_mobilePhone.setRequiredInterface("IMobilePhone", mobilePhone.getProvidedInterface("IMobilePhone"));
//		
//		mainMidlet_album.setRequiredInterface("IMobileResources", this );
//		
//		photo_mobilePhone.setRequiredInterface("IPhoto", photo.getProvidedInterface("IPhoto"));
//						
//		photo_mobilePhone.setRequiredInterface("IMobilePhone", mobilePhone.getProvidedInterface("IMobilePhone"));
//		
//		mainMidlet_photo.setRequiredInterface("IMobileResources", this );
//		
//		mainmidlet_mobilephone.setRequiredInterface("IMobileResources", this );
//		
//				
//		
//		
//		IMobilePhone mobPhone = (IMobilePhone) mobilePhone.getProvidedInterface("IMobilePhone");
//		
//		System.out.println("mobPhone.startUp()");
//		
//		mobPhone.startUp();
	}

	/**
	 * Pause the MIDlet
	 * This method does nothing at the moment.
	 */
	public void pauseApp() {
		//do nothing
	}

	/**
	 * Destroy the MIDlet
	 */
	public void destroyApp(boolean unconditional) {
		notifyDestroyed();
	}

	public MIDlet getMainMIDlet() {
		return this;
	}
}