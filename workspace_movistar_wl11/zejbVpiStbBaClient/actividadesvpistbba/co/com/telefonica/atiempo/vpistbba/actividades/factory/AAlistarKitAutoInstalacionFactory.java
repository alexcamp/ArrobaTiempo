/*
 * Creado el 21/02/2011
 *
 * TODO Para cambiar la plantilla de este archivo generado, vaya a
 * Ventana - Preferencias - Java - Estilo de c�digo - Plantillas de c�digo
 */
package co.com.telefonica.atiempo.vpistbba.actividades.factory;

import javax.ejb.CreateException;
import javax.naming.NamingException;

import co.com.telefonica.atiempo.actividades.IActividadEJB;
import co.com.telefonica.atiempo.actividades.IActividadFactoryEJBService;
import co.com.telefonica.atiempo.vpistbba.actividades.ejb.sb.AAlistarKitAutoInstalacionLocalHome;

import com.telefonica_chile.atiempo.actividades.TnProcesoExcepcion;
import com.telefonica_chile.atiempo.utiles.HomeFactory;

/**
 * @author damartinezv
 *
 * TODO Para cambiar la plantilla de este comentario generado, vaya a
 * Ventana - Preferencias - Java - Estilo de c�digo - Plantillas de c�digo
 */
public class AAlistarKitAutoInstalacionFactory implements IActividadFactoryEJBService {

    public AAlistarKitAutoInstalacionFactory() {
  	  super();  		
  	  
    }

        /* (non-Javadoc)
     * @see co.com.telefonica.atiempo.actividades.IActividadFactoryEJBService#getActividadEJB()
     */
    public IActividadEJB getActividadEJB() throws TnProcesoExcepcion {
        IActividadEJB actEJB=null;		
  	  try {
  	  AAlistarKitAutoInstalacionLocalHome ejbHome= (AAlistarKitAutoInstalacionLocalHome)HomeFactory.getHome(AAlistarKitAutoInstalacionLocalHome.JNDI_NAME);
  		  actEJB=(IActividadEJB) ejbHome.create();
  	  } catch (CreateException e) {
  		  throw new TnProcesoExcepcion(e.getClass().getName() + " : El EJB " + AAlistarKitAutoInstalacionLocalHome.JNDI_NAME + " no es posible levantarlo" + e.getMessage());
  	  } catch (NamingException e) {  			
  		  throw new TnProcesoExcepcion(e.getClass().getName() + " : El EJB " + AAlistarKitAutoInstalacionLocalHome.JNDI_NAME + " no es posible levantarlo" + e.getMessage());
  	  }catch (Exception e) {  			
		  e.printStackTrace();
  	  }
  	  return actEJB;
    }

}
