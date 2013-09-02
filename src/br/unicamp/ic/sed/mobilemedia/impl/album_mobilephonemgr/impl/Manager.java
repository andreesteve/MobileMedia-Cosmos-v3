package br.unicamp.ic.sed.mobilemedia.impl.album_mobilephonemgr.impl;

import java.util.*;

import br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.prov.IMobilePhone;

class Manager extends br.unicamp.ic.sed.cosmos.AManager{

	Hashtable reqInterfaceMap;
	Hashtable provInterfaceMap;

	public Manager() {
		
		this.setProvidedInterface("IMobilePhone", new IMobilePhoneAdapter(this));
		this.setProvidedInterface("IAlbum", new IAlbumAdapter(this));
		
		this.setRequiredInterfaceType("IAlbum", IAlbum.class);
		this.setRequiredInterfaceType("IMobilePhone", IMobilePhone.class);
	}
	
	
	public String[] getProvidedInterfaces(){ 
		Vector provInterfaceList = new Vector();
		provInterfaceList.addElement("IAlbum");
		provInterfaceList.addElement("IMobilePhone");

		return convertListToArray(provInterfaceList.elements());
	}

	public String[] getRequiredInterfaces(){ 

		return convertListToArray(reqInterfaceMap.keys());
	}

	public Object getProvidedInterface(String name){ 
		return this.provInterfaceMap.get(name);
	}

	public void setRequiredInterface(String name, Object adapter){ //System.out.println("Manager.setRequiredInterface()");
		reqInterfaceMap.put(name,adapter);
	}

	public Object getRequiredInterface(String name){ //System.out.println("Manager.getRequiredInterface()");
		return reqInterfaceMap.get(name);
	}

	private String[] convertListToArray(Enumeration stringEnum){ //System.out.println("Manager.convertListToArray()");
		Vector stringVector = new Vector();
		for (Enumeration iter = stringEnum; iter.hasMoreElements();) {
			String element = (String) iter.nextElement();
			stringVector.addElement(element);
		}

		String[] stringArray = new String[stringVector.size()];
		for (int i=0; i < stringVector.size(); i++){
			stringArray[i] = (String) stringVector.elementAt(i);
		}
		return stringArray;
	}
}



