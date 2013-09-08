package br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.impl;

import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.impl.mobilephonecontroller.spec.req.IMobileResourcesCtr;
import br.unicamp.ic.sed.cosmos.IManager;

class IAdapterMobileResources implements IMobileResourcesCtr {
	
	
	
		
	public MIDlet getMainMIDlet() {
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.spec.req.IMobileResources mobResources = (br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.spec.req.IMobileResources) mgr.getRequiredInterface("IMobileResources");
		return mobResources.getMainMIDlet();
	}

}
