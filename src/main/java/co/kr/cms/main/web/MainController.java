package co.kr.cms.main.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.cms.main.service.MainService;

@Controller
public class MainController {
	
	@Resource(name = "mainService")
	private MainService service;
	
	@RequestMapping(value = "/mainPage.do")
	public String mainPage() {
		return "main/main";
	}
}
