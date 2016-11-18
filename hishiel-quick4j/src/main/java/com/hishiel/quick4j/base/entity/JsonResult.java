package com.hishiel.quick4j.base.entity;

/**
 * @JsonResult Response JsonResult for Restful
 * @封装返回Json格式的数据
 * 
 * @author Hishiel
 * @create 2016年11月17日下午9:48:12
 */
public class JsonResult<T> extends Result {

	private static final long serialVersionUID = 3983954436765669498L;

	/**
	 * 数据
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
	 * 成功返回数据
	 */
	public JsonResult(T data) {
		this.data = data;
		super.setSuccess(true);
	}

	/**
	 * 成功返回数据和消息
	 */
	public JsonResult(T data, String message) {
		this.data = data;
		super.setMessage(message);
		super.setSuccess(true);
	}

	/**
	 * 自定义返回数据的结果
	 */
	public JsonResult(T data, String message, boolean isSuccess) {
		this.data = data;
		super.setMessage(message);
		super.setSuccess(isSuccess);
	}

}
