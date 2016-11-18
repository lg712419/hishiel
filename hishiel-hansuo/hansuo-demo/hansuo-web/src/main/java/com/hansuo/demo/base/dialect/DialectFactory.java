package com.hansuo.demo.base.dialect;

import org.apache.ibatis.session.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据方言工厂类，产生方言对象
 * 
 * @author hishiel
 * @since Oct 31, 20161:22:43 PM
 */
public class DialectFactory {

	public static final Logger logger = LoggerFactory.getLogger(DialectFactory.class);

	public static String dialectClass = null;

	/**
	 * 构建方言对象
	 */
	public static Dialect buildDialect(Configuration configuration) {
		if (dialectClass == null) {
			synchronized (DialectFactory.class) {
				if (dialectClass == null) {
					dialectClass = configuration.getVariables().getProperty("dialectClass");
				}
			}
		}

		Dialect dialect = null;
		try {
			dialect = (Dialect) Class.forName(dialectClass).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			logger.info("请检查 mybatis-config.xml 中 dialectClass  是否配置正确?");
		}
		return dialect;
	}
}
