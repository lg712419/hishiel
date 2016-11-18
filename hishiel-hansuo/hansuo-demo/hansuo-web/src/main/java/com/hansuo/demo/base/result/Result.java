package com.hansuo.demo.base.result;

import java.io.Serializable;

/**
 * 结果信息定义
 * 
 * @author hishiel
 * @since Oct 31, 20161:23:38 PM
 */
public class Result implements Serializable {

	private static final long serialVersionUID = -7241597106334863985L;

	/**
	 * 信息
	 */
	private String message;

	/**
	 * 状态码
	 */
	private int statusCode;

	/**
	 * 成功状态
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

}
