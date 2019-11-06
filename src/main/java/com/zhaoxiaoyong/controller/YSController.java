package com.zhaoxiaoyong.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhaoxiaoyong.entity.YingShi;
import com.zhaoxiaoyong.service.YSService;

@Controller
public class YSController {
	
	@Resource
	public YSService service;
	
	@RequestMapping("/list")
	public String findList(Model model){
		
		List<YingShi> list = service.findList();
		
		model.addAttribute("list", list);
		
		return null;
		
	}
}
