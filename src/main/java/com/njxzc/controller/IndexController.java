package com.njxzc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
	@RequestMapping("/index/login")
	public String login() {
		return "login";//跳转到“/WEB-INF/jsp/login.jsp”
	}
	@RequestMapping("/index/register")
	public String register() {
		return "register";
	}
}
