package com.hansuo.demo.base;

/**
 * @后续待完善 //TODO
 * @暂未使用
 * 
 * @所有自定义枚举类型实现该接口
 * 
 * @author hishiel
 * @since Oct 31, 20164:00:53 PM
 */
public interface BaseEnum {

	/**
	 * value：保存在数据库中的值
	 */
	public String getValue();

	/**
	 * text：前端显示值
	 */
	public String getText();
}
