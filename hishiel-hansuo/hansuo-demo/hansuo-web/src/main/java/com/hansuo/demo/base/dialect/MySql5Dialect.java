package com.hansuo.demo.base.dialect;

/**
 * MySQL 数据库方言
 * 
 * @author hishiel
 * @since Oct 31, 20161:22:13 PM
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
