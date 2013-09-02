package br.unicamp.ic.sed.mobilemedia.impl.mainuimidlet_photo.impl;

import java.util.*;

import br.unicamp.ic.sed.mobilemedia.impl.main.spec.prov.IMobileResources;

class Manager extends br.unicamp.ic.sed.cosmos.AManager{

	public Manager()
	{
	    // provided interfaces
	    setProvidedInterface("IMobileResources", new IMobileResourcesAdapter());

	    // required interfaces
	    this.setRequiredInterfaceType("IMobileResources", IMobileResources.class);
	}

	private Hashtable reqInterfaceMap = new Hashtable();

	public String[] getProvidedInterfaces(){
	   Vector provInterfaceList = new Vector();
	  provInterfaceList.addElement("IMobileResources");
	     
	   
	   return convertListToArray(provInterfaceList.elements());
	}
	
	public String[] getRequiredInterfaces(){
	
		return convertListToArray(reqInterfaceMap.keys());
	}
	
	public Object getProvidedInterface(String name){

	   if (name.equals("IMobileResources")){
	   		return new IMobileResourcesAdapter();
	   } 
	   
	   return null;
	}
	
	public void setRequiredInterface(String name, Object adapter){
		reqInterfaceMap.put(name,adapter);
	}
	
	public Object getRequiredInterface(String name){
	   return reqInterfaceMap.get(name);
	}

	private String[] convertListToArray(Enumeration stringEnum){
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



