/*
 * Created on 12-may-2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.tecnonautica.mvc;

/**
 * @author jguridi
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Evento extends Throwable{
	
	String nombre;
	
	public Evento(String nombre){
		this.nombre=nombre;	
	}
	
	public String getNombre(){
		return nombre;
	}
	
	
	
}
