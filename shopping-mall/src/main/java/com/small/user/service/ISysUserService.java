package com.small.user.service;

import java.util.List;
import java.util.Map;

import com.small.user.model.SysMenu;
import com.small.user.model.SysUser;

public interface ISysUserService {
	public static final String BEAN_ID = "sys.menuService";
	
	/**
	 * 系统登录
	 * @param user
	 * @return
	 */
	public String systemLogin(SysUser user);
	
	/**
	 * 获取菜单栏
	 * @return
	 */
	public Map<String, List<SysMenu>> getMenusByUser(SysUser user);
	
}
