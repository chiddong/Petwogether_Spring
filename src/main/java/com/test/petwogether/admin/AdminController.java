package com.test.petwogether.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService service;

}
