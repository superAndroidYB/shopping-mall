package com.small.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuViewController {
	
	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String index(Model model){
		return "index";
	}
	
	@RequestMapping(value = "/kwkwe", method = { RequestMethod.GET, RequestMethod.POST })
	public String kwkwe(Model model){
		return "kwkw";
	}

}
