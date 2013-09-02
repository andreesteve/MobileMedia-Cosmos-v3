package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionshandler_mobilephonemgr.impl;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IExceptionsHandlerCtr;
import br.unicamp.ic.sed.cosmos.IManager;

class IExceptionsHandlerAdapter implements IExceptionsHandlerCtr{

	public void handle(Exception exception) {
		br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionhandler.spec.prov.IExceptionsHandlerCtr handler;	
		br.unicamp.ic.sed.cosmos.IManager mgr = ComponentFactory.createInstance();
		handler = (br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionhandler.spec.prov.IExceptionsHandlerCtr)mgr.getRequiredInterface("IExceptionsHandler");
		handler.handle(exception);
	}
}