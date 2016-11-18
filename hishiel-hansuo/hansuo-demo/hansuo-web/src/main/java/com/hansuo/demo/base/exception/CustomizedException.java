package com.hansuo.demo.base.exception;

/**
 * @author hishiel
 * @since Oct 31, 20161:22:51 PM
 */
public class CustomizedException {

	/**
	 * 异常触发时间
	 */
	private long data = System.currentTimeMillis();

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

}
