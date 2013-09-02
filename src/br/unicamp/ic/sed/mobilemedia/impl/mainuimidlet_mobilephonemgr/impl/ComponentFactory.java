package br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_mobilephonemgr.impl;

import br.unicamp.ic.sed.cosmos.*;
public class ComponentFactory {

	private static br.unicamp.ic.sed.cosmos.IManager manager = null;

	public static br.unicamp.ic.sed.cosmos.IManager createInstance(){ 
		
		if (manager==null)
			manager = new Manager();
		
		return manager;
	}
}


