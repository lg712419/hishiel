package com.hansuo.demo.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hishiel
 * @since Nov 1, 201611:04:54 AM
 */
@Controller
public class CommonAction {

	/**
	 * 首页
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/404")
	public String error404() {
		return "404";
	}
}
