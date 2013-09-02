package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl;

import javax.microedition.lcdui.Image;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IPhotoCtr;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.req.IPhoto;
import br.unicamp.ic.sed.cosmos.IManager;

class IAdapterPhoto implements IPhotoCtr {

	
	
	
	public String getAddedPhotoName() {
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		return photo.getAddedPhotoName();
	}

	
	public String getAddedPhotoPath() {
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		return photo.getAddedPhotoPath();
	}

	
	public String getSelectedPhoto() {
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		return photo.getSelectedPhoto();
	}

	
	public void initAddPhotoToAlbum(String albumName) {
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		photo.initAddPhotoToAlbum(albumName);

	}

	
	public void initPhotoListScreen(String[] imageNames) {
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		photo.initPhotoListScreen(imageNames);
	}

	
	public void initPhotoViewScreen(Image image) {
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		photo.initPhotoViewScreen(image);

	}


	 
	public String getNewLabel() {
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		return photo.getNewLabel();
	}


	 
	public void initEditLabelScreen() {
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		IPhoto photo = (IPhoto) mgr.getRequiredInterface("IPhoto");
		photo.initEditLabelScreen();	
	}

}
