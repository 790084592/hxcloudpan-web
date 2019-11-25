package com.hx.hxcloudpan.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hx.hxcloudpan.dao.entity.UserEntity;
import com.hx.hxcloudpan.dao.service.UserService;

@Controller
@Component
public class IndexAction {

	@Autowired
	public UserService uservice;

	@RequestMapping("/index")
	@ResponseBody
	public String orm() {
		uservice.save(new UserEntity("2", "3", "4"));
		return "index";
	}

}
