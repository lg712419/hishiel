package com.hishiel.quick4j.base.orm.dialect;

import org.apache.ibatis.session.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @数据库方言工厂，生产方言对象
 * 
 * @author Hishiel
 * @create 2016年11月17日下午10:19:07
 */
public class DialectFactory {

	private static final Logger logger = LoggerFactory.getLogger(DialectFactory.class);
	public static String dialectClass = null;

	public static Dialect buildDialect(Configuration configuration) {
		if (dialectClass == null) {
			synchronized (DialectFactory.class) {
				if (dialectClass == null) {
					dialectClass = configuration.getVariables().getProperty("dialectClass");
					logger.debug("从配置文件中加载数据库方言类型<{}>", dialectClass);
				}
			}
		}
		Dialect dialect = null;
		try {
			dialect = (Dialect) Class.forName(dialectClass).newInstance();
		} catch (Exception e) {
			logger.error("请检查mybatis-config.xml中dialectClass<{}?是否配置正确?", dialectClass);
		}
		return dialect;
	}
}
