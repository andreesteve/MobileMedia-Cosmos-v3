package br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_photo.impl;

import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.mobilemedia.impl.photo.spec.req.IMobileResources;

class IMobileResourcesAdapter implements IMobileResources{

	public MIDlet getMainMIDlet() {
		br.unicamp.ic.sed.cosmos.IManager manager = ComponentFactory.createInstance();
		br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet.spec.prov.IMobileResources iMobileResources = (br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet.spec.prov.IMobileResources)manager.getRequiredInterface("IMobileResources");
		return iMobileResources.getMainMIDlet();
	}	
}