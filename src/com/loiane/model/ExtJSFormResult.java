package com.loiane.model;

/**
 * A simple return message for Ext JS
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class ExtJSFormResult {

	private boolean success;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public String toString(){
		return "{success:"+this.success+"}";
	}
}
