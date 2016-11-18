package com.hishiel.quick4j.base.util;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 通用工具类
 * 
 * @author Hishiel
 * @create 2016年11月17日下午11:31:30
 */
public class CommonUtils {

	public static String randomUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * md5加密
	 * 
	 * @param value
	 *            要加密的值
	 * @return md5加密后的值
	 */
	public static String md5Hex(String value) {
		return DigestUtils.md5Hex(value);
	}

	/**
	 * sha1加密
	 *
	 * @param value
	 *            要加密的值
	 * @return sha1加密后的值
	 */
	public static String sha1Hex(String value) {
		return DigestUtils.sha1Hex(value);
	}

	/**
	 * sha256加密
	 *
	 * @param value
	 *            要加密的值
	 * @return sha256加密后的值
	 */
	public static String sha256Hex(String value) {
		return DigestUtils.sha256Hex(value);
	}
}
