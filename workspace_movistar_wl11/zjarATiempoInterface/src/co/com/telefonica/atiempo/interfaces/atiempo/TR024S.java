//- Copyright Notice
//-----------------------------------------------------------------------
// (C) Copyright 2007 Telefonica Colombia, http://www.telefonica.com.co
// Bogota, Colombia All Rights Reserved
// THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF Telefonica Colombia
// The copyright notice above does not evidence any actual or intended
// publication of such source code.
//
// $Id: TR024S.java,v 1.1 2011/03/30 18:24:44 lfmartinez Exp $
//-----------------------------------------------------------------------

package co.com.telefonica.atiempo.interfaces.atiempo;

import co.com.telefonica.atiempo.util.EqualityUtilities;

/**
 * @author gmarcone
 * @version $Revision: 1.1 $
 */
public class TR024S extends ResponseHeader{

	private long atisRequestNumber;
	private long errorCode;
	private String errorCodeMessage;
	
	public int hashCode(){
		return (int)atisRequestNumber;
	}
	
	public boolean equals(Object arg0) {
		if (arg0 instanceof TR024S) {
			TR024S other = (TR024S) arg0;
			return super.equals(arg0)
				&& errorCode == other.errorCode
				&& EqualityUtilities.equals(errorCodeMessage,other.errorCodeMessage)
				&& atisRequestNumber == other.atisRequestNumber;
		}
		return false;
	}

	public long getAtisRequestNumber() {
		return atisRequestNumber;
	}
	/**
	 * @return
	 */
	public long getErrorCode() {
		return errorCode;
	}

	/**
	 * @return
	 */
	public String getErrorCodeMessage() {
		return errorCodeMessage;
	}

	/**
	 * @param l
	 */
	public void setAtisRequestNumber(long l) {
		atisRequestNumber = l;
	}

	/**
	 * @param l
	 */
	public void setErrorCode(long l) {
		errorCode = l;
	}

	/**
	 * @param string
	 */
	public void setErrorCodeMessage(String string) {
		errorCodeMessage = string;
	}

}
