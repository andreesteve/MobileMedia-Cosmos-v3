package br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.impl;

import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.impl.warningexceptionhandler.spec.req.IMobileResourcesWEH;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.spec.req.IMobileResources;

class IAdapterMobileResourcesWEH implements IMobileResourcesWEH {
 Manager manager;
	
	public IAdapterMobileResourcesWEH(Manager mgr) {
		manager = mgr;
	}
	
	public MIDlet getMainMIDlet() {
		IMobileResources mobResources = (IMobileResources) manager.getRequiredInterface("IMobileResources");
		return mobResources.getMainMIDlet();
	}

}
