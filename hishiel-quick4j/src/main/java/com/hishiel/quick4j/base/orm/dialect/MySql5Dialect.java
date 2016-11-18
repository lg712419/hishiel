package com.hishiel.quick4j.base.orm.dialect;

/**
 * @MySql数据库方言
 * 
 * @author Hishiel
 * @create 2016年11月17日下午10:31:58
 */
public class MySql5Dialect extends Dialect {

	protected static final String SQL_END_DELIMITER = ";";

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		return MySql5PageHelper.getLimitString(sql, offset, limit);
	}

	@Override
	public String getCountString(String sql) {
		return MySql5PageHelper.getCountString(sql);
	}

}
