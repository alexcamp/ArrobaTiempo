package co.com.telefonica.atiempo.soltec.ejb.eb;
/**
 * Local Home interface for Enterprise Bean: ElementoNoSerializado
 */
public interface ElementoNoSerializadoLocalHome extends javax.ejb.EJBLocalHome {
	
	public String JNDI_NAME = "ejb/co/com/telefonica/atiempo/soltec/ejb/eb/ElementoNoSerializadoLocalHome";
	/**
	 * Creates an instance from a key for Entity Bean: ElementoNoSerializado
	 */
	public co.com.telefonica.atiempo.soltec.ejb.eb.ElementoNoSerializadoLocal create(
		java.lang.Long id,
		co.com.telefonica.atiempo.soltec.ejb.eb.Peticion_stLocal argPeticion_st)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: ElementoNoSerializado
	 */
	public co.com.telefonica.atiempo.soltec.ejb.eb.ElementoNoSerializadoLocal findByPrimaryKey(
		co.com.telefonica.atiempo.soltec.ejb.eb.ElementoNoSerializadoKey primaryKey)
		throws javax.ejb.FinderException;
	/**
	 * Creates an instance from a key for Entity Bean: ElementoNoSerializado
	 */
	public co.com.telefonica.atiempo.soltec.ejb.eb.ElementoNoSerializadoLocal create(
		java.lang.Long id,
		java.lang.Long peticion_st_cod_ave_cd) throws javax.ejb.CreateException;
}