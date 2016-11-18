package com.hishiel.quick4j.base;

/**
 * @所有自定义枚举类应当实现该接口
 * 
 * @author Hishiel
 * @create 2016年11月17日下午9:42:42
 */
public interface BaseEnum {

	/**
	 * value:为保存在数据库中的值
	 */
	public String getValue();

	/**
	 * text:为前端显示值
	 */
	public String getText();
}
