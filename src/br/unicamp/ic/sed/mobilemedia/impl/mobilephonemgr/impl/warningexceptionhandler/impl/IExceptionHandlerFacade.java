   
package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionhandler.impl;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionhandler.spec.prov.IExceptionsHandlerCtr;

class IExceptionHandlerFacade implements IExceptionsHandlerCtr{

		
	public void handle(Exception exception) {
		WarningExceptionHandler handler = new WarningExceptionHandler();
		handler.handle(exception);		
	}
}