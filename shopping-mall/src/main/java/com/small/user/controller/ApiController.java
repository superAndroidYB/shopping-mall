package com.small.user.controller;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.small.user.model.SysUser;
import com.small.user.service.ISysUserService;

@RestController
public class ApiController {
	
	
	@Resource(name = ISysUserService.BEAN_ID)
	private ISysUserService userService;
	
	@RequestMapping(value = "/doSystemLogin", method = { RequestMethod.GET, RequestMethod.POST })
	public ResponseEntity<String> doSystemLogin(SysUser user){
		return ResponseEntity.ok(userService.systemLogin(user));
	}

}
