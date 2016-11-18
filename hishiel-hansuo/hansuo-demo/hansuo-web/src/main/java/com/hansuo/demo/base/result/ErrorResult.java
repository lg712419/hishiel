package com.hansuo.demo.base.result;

import java.util.HashMap;
import java.util.Map;

/**
 * ErrorResult：用于响应错误信息
 * 
 * @author hishiel
 * @since Oct 31, 20161:23:12 PM
 */
public class ErrorResult extends Result {

	private static final long serialVersionUID = -7448166855178722968L;

	/**
	 * 封装多个错误信息
	 */
	private Map<String, Object> errors = new HashMap<String, Object>();

	public Map<String, Object> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, Object> errors) {
		this.errors = errors;
	}

}
