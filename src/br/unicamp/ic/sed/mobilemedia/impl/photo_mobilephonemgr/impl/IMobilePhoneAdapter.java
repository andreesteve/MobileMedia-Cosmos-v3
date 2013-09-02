   
package br.unicamp.ic.sed.mobilemedia.impl.photo_mobilephonemgr.impl;

import javax.microedition.lcdui.Command;

import br.unicamp.ic.sed.mobilemedia.impl.photo.spec.req.IMobilePhone;

class IMobilePhoneAdapter implements IMobilePhone{
	
	Manager manager;
	
	IMobilePhoneAdapter(Manager mgr) {
		manager = mgr;
	}

	public void postCommand ( Command comand ){
		br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.prov.IMobilePhone mobilePhone;
		
		br.unicamp.ic.sed.cosmos.IManager manager = ComponentFactory.createInstance();
		mobilePhone = (br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.prov.IMobilePhone)manager.getRequiredInterface("IMobilePhone");
		mobilePhone.postCommand(comand);
	} 

}