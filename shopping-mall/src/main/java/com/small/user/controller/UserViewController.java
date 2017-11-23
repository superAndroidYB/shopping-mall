package com.small.user.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.small.common.Constants;
import com.small.user.model.SysMenu;
import com.small.user.model.SysUser;
import com.small.user.service.ISysUserService;
import com.small.utils.VerifyCodeUtils;

@Controller
public class UserViewController {

	@Autowired
	private HttpSession session;

	@Resource(name = ISysUserService.BEAN_ID)
	private ISysUserService userService;

	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String index(Model model) {
		SysUser user = (SysUser) session.getAttribute(Constants.SESSION_USER);
		Map<String, List<SysMenu>> menusByUser = userService.getMenusByUser(user);
		for (Map.Entry<String, List<SysMenu>> entry : menusByUser.entrySet()) {
			model.addAttribute(entry.getKey(), entry.getValue());
		}
		return "index";
	}

	@RequestMapping(value = "/systemlogin", method = { RequestMethod.GET, RequestMethod.POST })
	public String systemLogin(SysUser user) {
		return "systemlogin";
	}
	
	@RequestMapping(value = "/systemLoginOut", method = { RequestMethod.GET, RequestMethod.POST })
	public String systemLoginOut(){
		session.removeAttribute(Constants.SESSION_USER);
		return "systemlogin";
	}
	
	@RequestMapping(value = "/main", method = { RequestMethod.GET, RequestMethod.POST })
	public String main(){
		return "main";
	}

	@RequestMapping(value = "/verifyCodeImage", method = { RequestMethod.GET, RequestMethod.POST })
	public void verifyCodeImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");

		// 生成随机字串
		String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
		// 删除以前的
		session.removeAttribute(Constants.SESSION_VERCODE);
		session.setAttribute(Constants.SESSION_VERCODE, verifyCode.toLowerCase());
		// 生成图片
		int w = 100, h = 30;
		VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
	}

}
