package com.hansuo.demo.base.dialect;

/**
 * 数据方言抽象类
 * 
 * @author hishiel
 * @since Oct 31, 20161:22:32 PM
 */
public abstract class Dialect {

	/**
	 * 获取分页的Sql
	 */
	public abstract String getLimitString(String sql, int offset, int limit);

	/**
	 * 获取总数量的Sql
	 */
	public abstract String getCountString(String sql);
}
