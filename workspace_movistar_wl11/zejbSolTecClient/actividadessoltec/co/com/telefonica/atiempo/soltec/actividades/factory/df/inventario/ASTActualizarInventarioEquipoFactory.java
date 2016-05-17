/*
 * Created on 20-04-2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package co.com.telefonica.atiempo.soltec.actividades.factory.df.inventario;

import javax.ejb.CreateException;
import javax.naming.NamingException;

import co.com.telefonica.atiempo.actividades.IActividadEJB;
import co.com.telefonica.atiempo.actividades.IActividadFactoryEJBService;
import co.com.telefonica.atiempo.soltec.actividades.df.inventario.ejb.sb.ASTActualizarInventarioEquipoLocalHome;

import com.telefonica_chile.atiempo.actividades.TnProcesoExcepcion;
import com.telefonica_chile.atiempo.utiles.HomeFactory;


public class ASTActualizarInventarioEquipoFactory
	implements IActividadFactoryEJBService {

	/* (non-Javadoc)
	 * @see co.com.telefonica.atiempo.actividades.IActividadFactoryEJBService#getActividadEJB()
	 */
	public IActividadEJB getActividadEJB() throws TnProcesoExcepcion {
		IActividadEJB actEJB=null;
		try {
			ASTActualizarInventarioEquipoLocalHome ejbHome= (ASTActualizarInventarioEquipoLocalHome)HomeFactory.getHome(ASTActualizarInventarioEquipoLocalHome.JNDI_NAME);
			actEJB=ejbHome.create();
		} catch (CreateException e) {
			throw new TnProcesoExcepcion(e.getClass().getName() + " : El EJB " + ASTActualizarInventarioEquipoLocalHome.JNDI_NAME + " no es posible levantarlo" + e.getMessage());
		} catch (NamingException e) {			
			throw new TnProcesoExcepcion(e.getClass().getName() + " : El EJB " + ASTActualizarInventarioEquipoLocalHome.JNDI_NAME + " no es posible levantarlo" + e.getMessage());
		}
		return actEJB;
	}

}
