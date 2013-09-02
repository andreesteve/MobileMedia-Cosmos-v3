package br.unicamp.ic.sed.mobilemedia.impl.photo.impl;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.cosmos.IManager;
import br.unicamp.ic.sed.mobilemedia.impl.photo.spec.req.IMobilePhone;
import br.unicamp.ic.sed.mobilemedia.impl.photo.spec.req.IMobileResources;

class Manager extends br.unicamp.ic.sed.cosmos.AManager{

	public Manager()
	{
	    // provided interfaces
	    setProvidedInterface("IPhoto", new IPhotoFacade());

	    // required interfaces
	    this.setRequiredInterfaceType("IMobileResources", IMobileResources.class);
	    this.setRequiredInterfaceType("IMobilePhone", IMobilePhone.class);
	}
	
	Hashtable reqInterfaceMap = new Hashtable();
	
	public String[] getProvidedInterfaces(){
		Vector provInterfaceList = new Vector();
		provInterfaceList.addElement("IPhoto");
	     
	   
	   return convertListToArray(provInterfaceList.elements());
	}
	
	public String[] getRequiredInterfaces(){
	
		return convertListToArray(reqInterfaceMap.keys());
	}
	
	public void init(){}
	
	public Object getProvidedInterface(String name){

	   if (name.equals("IPhoto")){
	   		return new IPhotoFacade( );
	   }
	   
	   return null;
	}
	
	public void setRequiredInterface(String name, Object facade){
		reqInterfaceMap.put(name,facade);
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



