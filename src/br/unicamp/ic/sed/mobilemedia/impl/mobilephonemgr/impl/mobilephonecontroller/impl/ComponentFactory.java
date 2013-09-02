package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.impl;

import br.unicamp.ic.sed.cosmos.*;

public class ComponentFactory {

	static br.unicamp.ic.sed.cosmos.IManager manager = null;

	public static br.unicamp.ic.sed.cosmos.IManager createInstance(){
		if(manager == null)
			manager = new Manager();
		
		return manager;
	}
}



