//CR4860 SIGRES - GUSTAVOG

/*
 * Created on 05-04-2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package co.com.telefonica.atiempo.vpistbba.serviciosba;

import co.com.telefonica.atiempo.interfaces.atiempo.TR043E;
import co.com.telefonica.atiempo.utiles.ATiempoAppEx;
import co.com.telefonica.atiempo.vpistbba.mensajeria.util.QManagerService;

import com.telefonica_chile.atiempo.utiles.Utiles;

/**
 * @author Karlo
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ObtenerCuentaCorreoSigresBAMQ extends QManagerService {


	private static final String QUEUE = "jms/QMAT/IT_BUS_SOL_CUEN_CORR_BA_Q";
	
	/**
	 * @param queue
	 * @throws ATiempoAppEx
	 */
	public ObtenerCuentaCorreoSigresBAMQ() throws ATiempoAppEx {
		super(QUEUE);
		
	}

	/* (non-Javadoc)
	 * @see co.com.telefonica.atiempo.vpistbba.mensajeria.util.QManagerService#procesarDatos(java.lang.Object)
	 */
	protected Object procesarDatos(Object obj) {
		if (obj instanceof TR043E)
		{
			TR043E tr043e = (TR043E) obj;
			tr043e.setId(Utiles.ConversorGuion(filtraInvalidaCharacter(tr043e.getId())));
		}
		return obj;
	}

}
