package com.small.user.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.small.common.Constants;
import com.small.user.dao.SysMenuJpaDao;
import com.small.user.dao.SysPermissionsJpaDao;
import com.small.user.dao.SysUserJpaDao;
import com.small.user.model.SysMenu;
import com.small.user.model.SysPermissions;
import com.small.user.model.SysUser;
import com.small.user.service.ISysUserService;
import com.small.utils.MDFiveUtils;

@Service(ISysUserService.BEAN_ID)
public class SysUserServiceImpl implements ISysUserService {

	@Autowired
	private SysMenuJpaDao menuDao;
	@Autowired
	private SysPermissionsJpaDao permissionDao;
	@Autowired
	private SysUserJpaDao userDao;
	@Autowired
	private HttpSession session;

	@Override
	public String systemLogin(SysUser user) {
		String randomCode = (String) session.getAttribute(Constants.SESSION_VERCODE);
		SysUser userDB = userDao.findByUserNameOrUserPhone(user.getUserName(), user.getUserName());
		if (userDB == null || Constants.RoleType.USER.getCode().equals(userDB.getRole())) {
			return "0";
		}
		if (!StringUtils.equals(userDB.getUserPassword(), MDFiveUtils.encrypt(user.getUserPassword()))) {
			return "1";
		} else if (!randomCode.equals(StringUtils.lowerCase(user.getRandomCode()))) {
			return "2";
		}

		session.setAttribute(Constants.SESSION_USER, userDB);
		return "3";
	}

	@Override
	public Map<String, List<SysMenu>> getMenusByUser(SysUser user) {
		Map<String, List<SysMenu>> result = new HashMap<>();
		List<SysMenu> leftMenuList = new ArrayList<SysMenu>();
		List<SysMenu> topMenuList = new ArrayList<SysMenu>();
		// 获取该用户的角色列表
		if (!CollectionUtils.isEmpty(user.getPermiss())) {
			for (SysPermissions per : user.getPermiss()) {
				SysMenu menu = per.getMenu();
				if(Constants.MENU_LEFT.equals(menu.getPostion())){
					leftMenuList.add(menu);
				}else if(Constants.MENU_TOP.equals(menu.getPostion())){
					topMenuList.add(menu);
				}
			}
		}

		result.put("leftMenuList", leftMenuList);
		result.put("topMenuList", topMenuList);
		return result;
	}
}
