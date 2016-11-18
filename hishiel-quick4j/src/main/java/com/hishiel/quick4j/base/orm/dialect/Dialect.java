package com.hishiel.quick4j.base.orm.dialect;

/**
 * @数据库方言抽象类
 * 
 * @author Hishiel
 * @create 2016年11月17日下午10:17:12
 */
public abstract class Dialect {

	/**
	 * @获取分页Sql
	 */
	public abstract String getLimitString(String sql, int offset, int limit);

	/**
	 * @获取总数量Sql
	 */
	public abstract String getCountString(String sql);
}
