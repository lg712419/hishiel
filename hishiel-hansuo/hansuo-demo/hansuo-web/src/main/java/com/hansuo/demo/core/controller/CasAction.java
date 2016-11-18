package com.hansuo.demo.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该模块用户登录 后期进行单独拉出，实现单点登录功能
 * 
 * @author hishiel
 * @since Nov 1, 201611:14:48 AM
 */
@Controller
@RequestMapping("/cas")
public class CasAction {

	/**
	 * 登录页
	 */
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}
