package co.com.telefonica.atiempo.vpistbba.servicios;

import co.com.telefonica.atiempo.intf.IServicio;
import co.com.telefonica.atiempo.utiles.MDServicioBean;

/**
 * Bean implementation class for Enterprise Bean: ConsultarTroncalSipMDB
 */
public class ConsultarTroncalSipMDBBean extends MDServicioBean{

	/* (non-Javadoc)
	 * @see co.com.telefonica.atiempo.utiles.MDServicioBean#getServicio()
	 */
	public IServicio getServicio() {
		return new ConsultarTroncalSip();
	}
	
}
