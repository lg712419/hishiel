package com.hansuo.demo.base.result;

/**
 * JsonResult：Response JsonResult for RESTful
 * 
 * @封装Json格式的数据
 * 
 * @author hishiel
 * @since Oct 31, 20161:23:19 PM
 */
public class JsonResult<T> extends Result {

	private static final long serialVersionUID = -3289678494304387303L;

	/**
	 * Json数据
	 */
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public JsonResult() {

	}

	/**
	 * 自定义返回Json数据
	 */
	public JsonResult(T data, String message, boolean success) {
		this.data = data;
		setMessage(message);
		setSuccess(success);
	}

	/**
	 * 成功返回数据和消息
	 */
	public JsonResult(T data, String message) {
		this.data = data;
		setMessage(message);
		setSuccess(true);
	}

	/**
	 * 成功返回数据
	 */
	public JsonResult(T data) {
		this.data = data;
		setSuccess(true);
	}
}
