package br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.impl.warningexceptionhandler.impl;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

import br.unicamp.ic.sed.cosmos.IManager;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.impl.warningexceptionhandler.spec.prov.IExceptionsHandlerCtr;



class WarningExceptionHandler implements IExceptionsHandlerCtr{

	public void handle(Exception exception) {
		br.unicamp.ic.sed.cosmos.IManager manager = ComponentFactory.createInstance();
		MIDlet midlet = (MIDlet)manager.getRequiredInterface( "IMobileResources" );
		
		exception.printStackTrace();
		Alert alert = new Alert( "Error" , exception.getMessage() , null, AlertType.ERROR );
		alert.setTimeout( 5000 );
		
		Displayable currentDisplay = Display.getDisplay( midlet ).getCurrent();
		Display.getDisplay( midlet ).setCurrent(alert, currentDisplay );
	}
}
