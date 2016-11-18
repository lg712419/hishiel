package com.hansuo.demo.core.realm;

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

import com.hansuo.demo.core.entity.Permission;
import com.hansuo.demo.core.entity.Role;
import com.hansuo.demo.core.entity.User;
import com.hansuo.demo.core.service.PermissionService;
import com.hansuo.demo.core.service.RoleService;
import com.hansuo.demo.core.service.UserService;

/**
 * @自定义Realm组件 用户身份验证
 * 
 * @author hishiel
 * @since Nov 1, 201610:37:15 AM
 */
public class SecurityRealm extends AuthorizingRealm {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private PermissionService permissionService;

	/** 权限检查 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		String username = (String) principals.getPrimaryPrincipal();

		final User user = userService.selectByUsername(username);
		final List<Role> roles = roleService.selectRolesByUserId(user.getId());
		for (Role role : roles) {
			// 添加角色信息
			// logger.info("用户<{}>权限检查：角色信息：<{}>", user.getUsername(),
			// role.getRoleName());
			authorizationInfo.addRole(role.getRoleSign());

			final List<Permission> permissions = permissionService.selectPermissionsByRoleId(role.getId());
			for (Permission permission : permissions) {
				// 添加权限信息
				authorizationInfo.addStringPermission(permission.getPermissionSign());
			}
		}
		return authorizationInfo;
	}

	/** 登录验证 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		String username = (String) token.getPrincipal();
		String password = new String((char[]) token.getCredentials());

		// 通过数据库进行验证
		final User authentication = userService.authentication(new User(username, password));
		if (authentication == null) {
			throw new AuthenticationException("用户名或密码错误");
		}
		return new SimpleAuthenticationInfo(username, password, getName());
	}

}
