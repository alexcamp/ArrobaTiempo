/*
 * Created on Mar 26, 2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package co.com.telefonica.atiempo.vpistbba.actividades.factory.df.configuracion;

import javax.ejb.CreateException;
import javax.naming.NamingException;

import com.telefonica_chile.atiempo.actividades.TnProcesoExcepcion;
import com.telefonica_chile.atiempo.utiles.HomeFactory;

import co.com.telefonica.atiempo.actividades.IActividadEJB;
import co.com.telefonica.atiempo.actividades.IActividadFactoryEJBService;
import co.com.telefonica.atiempo.vpistbba.actividades.df.configuracion.ejb.sb.AObtenerConfiguracionEquipoLocalHome;

/**
 * @author 807793
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AObtenerConfiguracionEquipoFactory implements IActividadFactoryEJBService {

    /* (non-Javadoc)
     * @see co.com.telefonica.atiempo.actividades.IActividadFactoryEJBService#getActividadEJB()
     */
    public IActividadEJB getActividadEJB() throws TnProcesoExcepcion {
        IActividadEJB actEJB=null;
		try {
			AObtenerConfiguracionEquipoLocalHome ejbHome= (AObtenerConfiguracionEquipoLocalHome)HomeFactory.getHome(AObtenerConfiguracionEquipoLocalHome.JNDI_NAME);
			actEJB=ejbHome.create();   
		} catch (CreateException e) {
			throw new TnProcesoExcepcion(e.getClass().getName() + " : El EJB " + AObtenerConfiguracionEquipoLocalHome.JNDI_NAME + " no es posible levantarlo" + e.getMessage());
		} catch (NamingException e) {
			
			throw new TnProcesoExcepcion(e.getClass().getName() + " : El EJB " + AObtenerConfiguracionEquipoLocalHome.JNDI_NAME + " no es posible levantarlo" + e.getMessage());
		}
		return actEJB;
    }

}
