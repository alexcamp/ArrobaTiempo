package co.com.telefonica.atiempo.vpistbba.mensajeria.entrada;

import co.com.telefonica.atiempo.intf.IServicio;
import co.com.telefonica.atiempo.utiles.MDServicioBean;
import co.com.telefonica.atiempo.vpistbba.servicios.ActualizacionInventarioTVServicio;

/**
 * Bean implementation class for Enterprise Bean: ActualizacionInventarioTVMD
 */
public class ActualizacionInventarioTVMDBean extends MDServicioBean
{

	/* (non-Javadoc)
	 * @see co.com.telefonica.atiempo.utiles.MDServicioBean#getServicio()
	 */
	public IServicio getServicio()
	{
		return new ActualizacionInventarioTVServicio();
	}
	
}
