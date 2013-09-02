package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl;

import br.unicamp.ic.sed.cosmos.IManager;



public class ComponentFactory {

	static br.unicamp.ic.sed.cosmos.IManager mgr;
	
	public static br.unicamp.ic.sed.cosmos.IManager createInstance(){
		if(mgr == null)
			mgr = new Manager();
		return mgr;
	}
	
}
