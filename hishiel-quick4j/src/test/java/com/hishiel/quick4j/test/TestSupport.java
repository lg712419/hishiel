package com.hishiel.quick4j.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @TestSupport：Spring的测试支持，用于测试由Spring管理的bean，编写测试类时，继承该类
 * 
 * @author Hishiel
 * @create 2016年11月17日下午11:25:27
 */
@ContextConfiguration(locations = { "classpath:spring-*.xml" })
public class TestSupport extends AbstractJUnit4SpringContextTests {

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
		return endTime;
	}

	/**
	 * 输出记录
	 */
	protected void log() {
		String text = "\n开始时间 : " + this.startTime + "\n结束时间 : " + this.endTime + "\n执行时间 : "
				+ (this.endTime - this.startTime);
		logger.info(text);
	}
}
