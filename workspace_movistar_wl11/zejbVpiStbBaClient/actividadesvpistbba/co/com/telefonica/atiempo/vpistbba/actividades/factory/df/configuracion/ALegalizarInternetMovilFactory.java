/*
 * Created on 07-02-2008
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package co.com.telefonica.atiempo.vpistbba.actividades.factory.df.configuracion;

import javax.ejb.CreateException;
import javax.naming.NamingException;

import co.com.telefonica.atiempo.actividades.IActividadEJB;
import co.com.telefonica.atiempo.actividades.IActividadFactoryEJBService;
import co.com.telefonica.atiempo.vpistbba.actividades.df.configuracion.ejb.sb.ALegalizarInternetMovilLocalHome;

import com.telefonica_chile.atiempo.actividades.TnProcesoExcepcion;
import com.telefonica_chile.atiempo.utiles.HomeFactory;

/**
 * @author mfmendez
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ALegalizarInternetMovilFactory implements IActividadFactoryEJBService {

	/* (non-Javadoc)
	 * @see co.com.telefonica.atiempo.actividades.IActividadFactoryEJBService#getActividadEJB()
	 */
	public IActividadEJB getActividadEJB() throws TnProcesoExcepcion {
		IActividadEJB actEJB=null;
		try {
			ALegalizarInternetMovilLocalHome ejbHome= (ALegalizarInternetMovilLocalHome)HomeFactory.getHome(ALegalizarInternetMovilLocalHome.JNDI_NAME);
			actEJB=ejbHome.create();
		} catch (CreateException e) {
			throw new TnProcesoExcepcion(e.getClass().getName() + " : El EJB " + ALegalizarInternetMovilLocalHome.JNDI_NAME + " no es posible levantarlo" + e.getMessage());
		} catch (NamingException e) {
			
			throw new TnProcesoExcepcion(e.getClass().getName() + " : El EJB " + ALegalizarInternetMovilLocalHome.JNDI_NAME + " no es posible levantarlo" + e.getMessage());
		}
		return actEJB;
	}
}
