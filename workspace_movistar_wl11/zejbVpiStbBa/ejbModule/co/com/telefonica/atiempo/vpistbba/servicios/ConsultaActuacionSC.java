/*
 * Created on Aug 31, 2010
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package co.com.telefonica.atiempo.vpistbba.servicios;

import co.com.telefonica.atiempo.interfaces.atiempo.TR702S;
import co.com.telefonica.atiempo.utiles.ATiempoAppEx;
import co.com.telefonica.atiempo.utiles.ServicioBasico;
import co.com.telefonica.atiempo.utiles.XMLUtilities;

/**
 * @author damartinezv
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConsultaActuacionSC extends ServicioBasico {

	/* (non-Javadoc)
	 * @see co.com.telefonica.atiempo.utiles.ServicioBasico#procesar(java.lang.Object[])
	 */
	protected void procesar(Object[] obj) throws ATiempoAppEx {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see co.com.telefonica.atiempo.utiles.ServicioBasico#convertirMensaje(java.lang.String)
	 */
	protected Object[] convertirMensaje(String mensaje) throws ATiempoAppEx {
        TR702S tr702S = (TR702S) XMLUtilities.unmarshall(mensaje);
        Object[] obj = new Object[1];
        obj[0] = tr702S;

        return obj;
	}

}
