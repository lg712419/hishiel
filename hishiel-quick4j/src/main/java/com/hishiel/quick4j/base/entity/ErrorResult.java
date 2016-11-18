package com.hishiel.quick4j.base.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @ErrorResult 用于响应错误消息的结果对象
 * 
 * @author Hishiel
 * @create 2016年11月17日下午9:56:02
 */
public class ErrorResult extends Result {

	private static final long serialVersionUID = -2558860894520265725L;

	/**
	 * 封装多个错误消息
	 */
	private Map<String, Object> errors = new HashMap<>();

	public Map<String, Object> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, Object> errors) {
		this.errors = errors;
	}

}
