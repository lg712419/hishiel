package com.hishiel.quick4j.demo.security;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hishiel.quick4j.demo.entity.Permission;
import com.hishiel.quick4j.demo.entity.Role;
import com.hishiel.quick4j.demo.entity.User;
import com.hishiel.quick4j.demo.service.PermissionService;
import com.hishiel.quick4j.demo.service.RoleService;
import com.hishiel.quick4j.demo.service.UserService;

/**
 * 用户身份验证，授权Realm组件
 * 
 * @author hishiel
 * @since 2016年11月18日上午10:55:33
 */
public class SecurityRealm extends AuthorizingRealm {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private PermissionService permissionService;

	/**
	 * 权限检查
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

		String username = String.valueOf(principals.getPrimaryPrincipal());
		final User user = userService.selectByUsername(username);
		final List<Role> roles = roleService.selectRolesByUserId(user.getId());
		for (Role role : roles) {
			// 添加角色信息
			System.err.println(role);
			logger.info("为用户{}添加角色信息:{}", role);
			authorizationInfo.addRole(role.getRoleSign());

			final List<Permission> permissions = permissionService.selectPermissionsByRoleId(role.getId());
			for (Permission permission : permissions) {
				// 添加权限信息
				System.err.println(permission);
				logger.info("为用户{}添加权限信息:{}", permission);
				authorizationInfo.addStringPermission(permission.getPermissionSign());
			}
		}
		return authorizationInfo;
	}

	/**
	 * 登录验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = String.valueOf(token.getPrincipal());
		String password = new String((char[]) token.getCredentials());
		final User authentication = userService.authentication(new User());
		if (authentication == null) {
			throw new AuthenticationException("用户名或密码错误!");
		}
		return new SimpleAuthenticationInfo(username, password, getName());
	}

}
