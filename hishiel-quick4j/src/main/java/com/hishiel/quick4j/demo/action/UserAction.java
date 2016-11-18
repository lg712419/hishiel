package com.hishiel.quick4j.demo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hishiel.quick4j.demo.entity.User;
import com.hishiel.quick4j.demo.service.UserService;

/**
 * 用户控制器
 * 
 * @author hishiel
 * @since 2016年11月18日上午11:12:49
 */
@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	private UserService userService;

	/**
	 * 用户登录
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model, User user) {

		try {
			Subject subject = SecurityUtils.getSubject();
			// 已登录 则跳到首页
			if (subject.isAuthenticated()) {
				return "redirect:/";
			}
			// 身份验证
			subject.login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));
			// 验证成功后在Session中保存用户信息
			final User currentUser = userService.selectByUsername(user.getUsername());
			request.getSession().setAttribute("currentUesr", currentUser);
		} catch (AuthenticationException e) {
			// 身份验证失败
			model.addAttribute("error", "用户名或密码错误!");
			return "login";
		}
		return "redirect:/";
	}

	public String logout(HttpSession session) {
		session.removeAttribute("currentUser");
		// 登出操作
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "login";
	}
}
