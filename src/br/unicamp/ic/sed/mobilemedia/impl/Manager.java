package br.unicamp.ic.sed.mobilemedia.impl;


import br.unicamp.ic.sed.cosmos.*;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.spec.prov.IMobilePhone;

class Manager extends AManagerComposite implements IManager {

//	br.unicamp.ic.sed.cosmos.IManager album;
//	
//	br.unicamp.ic.sed.cosmos.IManager filesystem;
//	br.unicamp.ic.sed.cosmos.IManager album_mobilePhone;
//	br.unicamp.ic.sed.cosmos.IManager filesystem_mobilePhone;
//	
//	br.unicamp.ic.sed.cosmos.IManager photo;
//	br.unicamp.ic.sed.cosmos.IManager photo_mobilePhone;
//	
//	br.unicamp.ic.sed.cosmos.IManager mainMidlet_album;
//	br.unicamp.ic.sed.cosmos.IManager mainMidlet_photo;
//	br.unicamp.ic.sed.cosmos.IManager mainmidlet_mobilephone;
//	
//	br.unicamp.ic.sed.cosmos.IManager main;
//	
//	//subcomponents
//	br.unicamp.ic.sed.cosmos.IManager mobilePhone;
//	br.unicamp.ic.sed.cosmos.IManager mobilePhone2;
//	/*br.unicamp.ic.sed.cosmos.IManager excepHandler_mobilePhone;
//	br.unicamp.ic.sed.cosmos.IManager excepHandler; 
//	br.unicamp.ic.sed.cosmos.IManager mobilePhoneControl;
//	*/

	public Manager() {
		
System.out.println("Starting MobileMediaOO - v1");
		
		// create all imanagers
		br.unicamp.ic.sed.cosmos.IManager filesystem = br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr.impl.ComponentFactory.createInstance();
		br.unicamp.ic.sed.cosmos.IManager album_mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.album_mobilephotomgr.impl.ComponentFactory.createInstance();
		br.unicamp.ic.sed.cosmos.IManager mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.impl.ComponentFactory.createInstance();
				
		br.unicamp.ic.sed.cosmos.IManager main = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet.impl.ComponentFactory.createInstance();
				
		br.unicamp.ic.sed.cosmos.IManager filesystem_mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.filesystemmgr_mobilephotomgr.impl.ComponentFactory.createInstance();
		br.unicamp.ic.sed.cosmos.IManager album = br.unicamp.ic.sed.mobilemedia.impl.album.impl.ComponentFactory.createInstance();
				
		br.unicamp.ic.sed.cosmos.IManager mainMidlet_album = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_album.impl.ComponentFactory.createInstance();
		br.unicamp.ic.sed.cosmos.IManager photo = br.unicamp.ic.sed.mobilemedia.impl.photo.impl.ComponentFactory.createInstance();
				
		br.unicamp.ic.sed.cosmos.IManager photo_mobilePhone = br.unicamp.ic.sed.mobilemedia.impl.photo_mobilephotomgr.impl.ComponentFactory.createInstance();
		br.unicamp.ic.sed.cosmos.IManager mainMidlet_photo = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_photo.impl.ComponentFactory.createInstance();
		
		br.unicamp.ic.sed.cosmos.IManager mainmidlet_mobilephone = br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_mobilephotomgr.impl.ComponentFactory.createInstance();			
		
		/*Setting required interfaces*/
		
		/*MobilePhoneMgr*/
		mobilePhone.setRequiredInterface("IFilesystem", filesystem_mobilePhone.getProvidedInterface("IFilesystem"));
		
		mobilePhone.setRequiredInterface("IMobileResources", mainmidlet_mobilephone.getProvidedInterface("IMobileResources") );
		
		mobilePhone.setRequiredInterface("IPhoto", photo_mobilePhone.getProvidedInterface("IPhoto"));

		mobilePhone.setRequiredInterface("IAlbum", album_mobilePhone.getProvidedInterface("IAlbum"));
		
		/*Album*/
		album.setRequiredInterface("IMobilePhone", album_mobilePhone.getProvidedInterface("IMobilePhone"));
		
		album.setRequiredInterface("IMobileResources", mainMidlet_album.getProvidedInterface("IMobileResources") );
		
		/*Photo*/
		photo.setRequiredInterface("IMobilePhone", photo_mobilePhone.getProvidedInterface("IMobilePhone"));
		
		photo.setRequiredInterface("IMobileResources", mainMidlet_photo.getProvidedInterface("IMobileResources") );
		
		/*connectors*/
		filesystem_mobilePhone.setRequiredInterface("IFilesystem", filesystem.getProvidedInterface("IFilesystem"));
		
		album_mobilePhone.setRequiredInterface("IAlbum", album.getProvidedInterface("IAlbum"));
	
		album_mobilePhone.setRequiredInterface("IMobilePhone", mobilePhone.getProvidedInterface("IMobilePhone"));
		
		mainMidlet_album.setRequiredInterface("IMobileResources", main.getProvidedInterface("IMobileResources"));
		
		photo_mobilePhone.setRequiredInterface("IPhoto", photo.getProvidedInterface("IPhoto"));
						
		photo_mobilePhone.setRequiredInterface("IMobilePhone", mobilePhone.getProvidedInterface("IMobilePhone"));
		
		mainMidlet_photo.setRequiredInterface("IMobileResources", main.getProvidedInterface("IMobileResources"));
		
		mainmidlet_mobilephone.setRequiredInterface("IMobileResources", main.getProvidedInterface("IMobileResources"));
		
				
		
		
//		IMobilePhone mobPhone = (IMobilePhone) mobilePhone.getProvidedInterface("IMobilePhone");
//		
//		System.out.println("mobPhone.startUp()");
//		
//		mobPhone.startUp();
		
	}

}
