package com.hansuo.demo.base.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * TestSupport ：Spring测试支持，用于测试由Spring管理的bean，编写测试类时，继承该类
 * 
 * @author hishiel
 * @since Oct 31, 20162:20:43 PM
 */
@ContextConfiguration(locations = { "classpath*:application-context.xml" })
public class TestSupport extends AbstractJUnit4SpringContextTests {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	protected long startTime;
	protected long endTime;

	/**
	 * 记录开始运行时间
	 */
	protected long start() {
		this.startTime = System.currentTimeMillis();
		return startTime;
	}

	/**
	 * 记录结束运行时间
	 */
	protected long end() {
		this.endTime = System.currentTimeMillis();
		log();
		return endTime;
	}

	/**
	 * 输出记录
	 */
	protected void log() {
		logger.info("开始时间：{}", startTime);
		logger.info("结束时间：{}", endTime);
		logger.info("执行时间：{}", endTime - startTime);
	}

}
