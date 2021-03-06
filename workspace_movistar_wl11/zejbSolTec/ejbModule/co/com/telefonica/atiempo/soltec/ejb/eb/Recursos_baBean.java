package co.com.telefonica.atiempo.soltec.ejb.eb;

import javax.ejb.CreateException;

/**
 * Bean implementation class for Enterprise Bean: Recursos_ba
 */
public abstract class Recursos_baBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext myEntityCtx;
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		myEntityCtx = ctx;
	}
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return myEntityCtx;
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		myEntityCtx = null;
	}
	
	public co.com.telefonica.atiempo.soltec.ejb.eb.Recursos_baKey ejbCreate(Long id_conector,Peticion_stLocal local) throws CreateException
	{
		setId_conector(id_conector);
		return null;
	}

	public void ejbPostCreate(Long id_conector,Peticion_stLocal local) throws CreateException
	{
		setPeticion_st(local);
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
	}
	/**
	 * Get accessor for persistent attribute: id_conector
	 */
	public abstract java.lang.Long getId_conector();
	/**
	 * Set accessor for persistent attribute: id_conector
	 */
	public abstract void setId_conector(java.lang.Long newId_conector);
	/**
	 * Get accessor for persistent attribute: cod_error
	 */
	public abstract java.lang.Integer getCod_error();
	/**
	 * Set accessor for persistent attribute: cod_error
	 */
	public abstract void setCod_error(java.lang.Integer newCod_error);
	/**
	 * Get accessor for persistent attribute: puerto_actual
	 */
	public abstract java.lang.String getPuerto_actual();
	/**
	 * Set accessor for persistent attribute: puerto_actual
	 */
	public abstract void setPuerto_actual(java.lang.String newPuerto_actual);
	/**
	 * Get accessor for persistent attribute: post_actual
	 */
	public abstract java.lang.String getPost_actual();
	/**
	 * Set accessor for persistent attribute: post_actual
	 */
	public abstract void setPost_actual(java.lang.String newPost_actual);
	/**
	 * Get accessor for persistent attribute: adsl_actual
	 */
	public abstract java.lang.String getAdsl_actual();
	/**
	 * Set accessor for persistent attribute: adsl_actual
	 */
	public abstract void setAdsl_actual(java.lang.String newAdsl_actual);
	/**
	 * Get accessor for persistent attribute: masc_lan_actual
	 */
	public abstract java.lang.String getMasc_lan_actual();
	/**
	 * Set accessor for persistent attribute: masc_lan_actual
	 */
	public abstract void setMasc_lan_actual(
		java.lang.String newMasc_lan_actual);
	/**
	 * Get accessor for persistent attribute: dir_ip_dslam_actual
	 */
	public abstract java.lang.String getDir_ip_dslam_actual();
	/**
	 * Set accessor for persistent attribute: dir_ip_dslam_actual
	 */
	public abstract void setDir_ip_dslam_actual(
		java.lang.String newDir_ip_dslam_actual);
	/**
	 * Get accessor for persistent attribute: dir_ip_wan_actual
	 */
	public abstract java.lang.String getDir_ip_wan_actual();
	/**
	 * Set accessor for persistent attribute: dir_ip_wan_actual
	 */
	public abstract void setDir_ip_wan_actual(
		java.lang.String newDir_ip_wan_actual);
	/**
	 * Get accessor for persistent attribute: frame_actual
	 */
	public abstract java.lang.String getFrame_actual();
	/**
	 * Set accessor for persistent attribute: frame_actual
	 */
	public abstract void setFrame_actual(java.lang.String newFrame_actual);
	/**
	 * Get accessor for persistent attribute: puerto_nuevo
	 */
	public abstract java.lang.String getPuerto_nuevo();
	/**
	 * Set accessor for persistent attribute: puerto_nuevo
	 */
	public abstract void setPuerto_nuevo(java.lang.String newPuerto_nuevo);
	/**
	 * Get accessor for persistent attribute: post_nuevo
	 */
	public abstract java.lang.String getPost_nuevo();
	/**
	 * Set accessor for persistent attribute: post_nuevo
	 */
	public abstract void setPost_nuevo(java.lang.String newPost_nuevo);
	/**
	 * Get accessor for persistent attribute: adsl_nuevo
	 */
	public abstract java.lang.String getAdsl_nuevo();
	/**
	 * Set accessor for persistent attribute: adsl_nuevo
	 */
	public abstract void setAdsl_nuevo(java.lang.String newAdsl_nuevo);
	/**
	 * Get accessor for persistent attribute: masc_lan_nueva
	 */
	public abstract java.lang.String getMasc_lan_nueva();
	/**
	 * Set accessor for persistent attribute: masc_lan_nueva
	 */
	public abstract void setMasc_lan_nueva(java.lang.String newMasc_lan_nueva);
	/**
	 * Get accessor for persistent attribute: dir_ip_dslam_nueva
	 */
	public abstract java.lang.String getDir_ip_dslam_nueva();
	/**
	 * Set accessor for persistent attribute: dir_ip_dslam_nueva
	 */
	public abstract void setDir_ip_dslam_nueva(
		java.lang.String newDir_ip_dslam_nueva);
	/**
	 * Get accessor for persistent attribute: dir_ip_wan_nueva
	 */
	public abstract java.lang.String getDir_ip_wan_nueva();
	/**
	 * Set accessor for persistent attribute: dir_ip_wan_nueva
	 */
	public abstract void setDir_ip_wan_nueva(
		java.lang.String newDir_ip_wan_nueva);
	/**
	 * Get accessor for persistent attribute: frame_nuevo
	 */
	public abstract java.lang.String getFrame_nuevo();
	/**
	 * Set accessor for persistent attribute: frame_nuevo
	 */
	public abstract void setFrame_nuevo(java.lang.String newFrame_nuevo);
	/**
	 * Get accessor for persistent attribute: correlativo
	 */
	public abstract java.lang.Long getCorrelativo();
	/**
	 * Set accessor for persistent attribute: correlativo
	 */
	public abstract void setCorrelativo(java.lang.Long newCorrelativo);
	/**
	 * Get accessor for persistent attribute: peti_numero
	 */
	public abstract java.lang.Long getPeti_numero();
	/**
	 * Set accessor for persistent attribute: peti_numero
	 */
	public abstract void setPeti_numero(java.lang.Long newPeti_numero);
	/**
	 * Get accessor for persistent attribute: vpivci_actual
	 */
	public abstract java.lang.String getVpivci_actual();
	/**
	 * Set accessor for persistent attribute: vpivci_actual
	 */
	public abstract void setVpivci_actual(java.lang.String newVpivci_actual);
	/**
	 * Get accessor for persistent attribute: vpivci_red_actual
	 */
	public abstract java.lang.String getVpivci_red_actual();
	/**
	 * Set accessor for persistent attribute: vpivci_red_actual
	 */
	public abstract void setVpivci_red_actual(
		java.lang.String newVpivci_red_actual);
	/**
	 * Get accessor for persistent attribute: slot_actual
	 */
	public abstract java.lang.String getSlot_actual();
	/**
	 * Set accessor for persistent attribute: slot_actual
	 */
	public abstract void setSlot_actual(java.lang.String newSlot_actual);
	/**
	 * Get accessor for persistent attribute: dir_ip_lan_nueva
	 */
	public abstract java.lang.String getDir_ip_lan_nueva();
	/**
	 * Set accessor for persistent attribute: dir_ip_lan_nueva
	 */
	public abstract void setDir_ip_lan_nueva(
		java.lang.String newDir_ip_lan_nueva);
	/**
	 * Get accessor for persistent attribute: vpivci_nuevo
	 */
	public abstract java.lang.String getVpivci_nuevo();
	/**
	 * Set accessor for persistent attribute: vpivci_nuevo
	 */
	public abstract void setVpivci_nuevo(java.lang.String newVpivci_nuevo);
	/**
	 * Get accessor for persistent attribute: vpivci_red_nuevo
	 */
	public abstract java.lang.String getVpivci_red_nuevo();
	/**
	 * Set accessor for persistent attribute: vpivci_red_nuevo
	 */
	public abstract void setVpivci_red_nuevo(
		java.lang.String newVpivci_red_nuevo);
	/**
	 * Get accessor for persistent attribute: slot_nuevo
	 */
	public abstract java.lang.String getSlot_nuevo();
	/**
	 * Set accessor for persistent attribute: slot_nuevo
	 */
	public abstract void setSlot_nuevo(java.lang.String newSlot_nuevo);
	/**
	 * Get accessor for persistent attribute: desc_error
	 */
	public abstract java.lang.String getDesc_error();
	/**
	 * Set accessor for persistent attribute: desc_error
	 */
	public abstract void setDesc_error(java.lang.String newDesc_error);
	/**
	 * This method was generated for supporting the relationship role named peticion_st.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract co
		.com
		.telefonica
		.atiempo
		.soltec
		.ejb
		.eb
		.Peticion_stLocal getPeticion_st();
	/**
	 * This method was generated for supporting the relationship role named peticion_st.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract void setPeticion_st(
		co.com.telefonica.atiempo.soltec.ejb.eb.Peticion_stLocal aPeticion_st);
	/**
	 * Get accessor for persistent attribute: father_email_actual
	 */
	public abstract java.lang.String getFather_email_actual();
	/**
	 * Set accessor for persistent attribute: father_email_actual
	 */
	public abstract void setFather_email_actual(
		java.lang.String newFather_email_actual);
	/**
	 * Get accessor for persistent attribute: modem_marca
	 */
	public abstract java.lang.String getModem_marca();
	/**
	 * Set accessor for persistent attribute: modem_marca
	 */
	public abstract void setModem_marca(java.lang.String newModem_marca);
	/**
	 * Get accessor for persistent attribute: serial
	 */
	public abstract java.lang.String getSerial();
	/**
	 * Set accessor for persistent attribute: serial
	 */
	public abstract void setSerial(java.lang.String newSerial);
	/**
	 * Get accessor for persistent attribute: modelo
	 */
	public abstract java.lang.String getModelo();
	/**
	 * Set accessor for persistent attribute: modelo
	 */
	public abstract void setModelo(java.lang.String newModelo);
    /**
     * Get accessor for persistent attribute: dir_ip_lan_actual
     */
    public abstract java.lang.String getDir_ip_lan_actual();
    /**
     * Set accessor for persistent attribute: dir_ip_lan_actual
     */
    public abstract void setDir_ip_lan_actual(
        java.lang.String newDir_ip_lan_actual);
}
