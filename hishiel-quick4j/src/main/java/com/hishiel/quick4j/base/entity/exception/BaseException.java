package com.hishiel.quick4j.base.entity.exception;

/**
 * @所有自定义异常应当继承此异常类
 * 
 * @author Hishiel
 * @create 2016年11月17日下午9:38:30
 */
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = 3049707297704189127L;

	/**
	 * 异常发生的时间
	 */
	private long date = System.currentTimeMillis();

	public long getDate() {
		return date;
	}

}
