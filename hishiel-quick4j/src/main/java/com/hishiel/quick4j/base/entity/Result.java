package com.hishiel.quick4j.base.entity;

import java.io.Serializable;

/**
 * @响应的结果对象
 * @所有自定义的返回结果对象应当继承此结果对象
 * 
 * @author Hishiel
 * @create 2016年11月17日下午9:45:55
 */
public class Result implements Serializable {

	private static final long serialVersionUID = -8709355347363097537L;

	/**
	 * 信息
	 */
	private String message;

	/**
	 * 状态码
	 */
	private int statusCode;

	/**
	 * 是否成功
	 */
	private boolean success;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
