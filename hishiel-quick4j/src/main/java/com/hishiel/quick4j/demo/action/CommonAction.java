package com.hishiel.quick4j.demo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公共视图控制器
 * 
 * @author hishiel
 * @since 2016年11月18日上午11:11:29
 */
@Controller
public class CommonAction {

	/**
	 * 首页
	 */
	@RequestMapping("index")
	public String index() {
		return "index";
	}

	/**
	 * 登录页
	 */
	@RequestMapping("/login")
	public String login() {
		System.err.println("login");
		return "login";
	}

	/**
	 * 404
	 */
	@RequestMapping("/404")
	public String error404() {
		return "404";
	}

	/**
	 * 401
	 */
	@RequestMapping("/401")
	public String error401() {
		return "401";
	}

	/**
	 * 500
	 */
	@RequestMapping("/500")
	public String error500() {
		return "500";
	}
}
