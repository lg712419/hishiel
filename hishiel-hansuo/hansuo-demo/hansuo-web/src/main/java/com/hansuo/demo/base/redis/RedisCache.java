package com.hansuo.demo.base.redis;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;

/**
 * RedisCache ： Redis缓存插件
 * 
 * @author hishiel
 * @since Oct 31, 20161:23:46 PM
 */
//@Component(value = "redisCache")
public class RedisCache {

	public static final String host = "127.0.0.1";
	public static final int port = 6379;

	private Jedis jedis = new Jedis(host, port);

	public String cache(String key, String value, int seconds) {
		String result = jedis.set(key, value);
		jedis.expire(key, seconds);
		return result;
	}

	public String get(String key) {
		return jedis.get(key);
	}
}
