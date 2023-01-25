package com.test.petwogether.petsitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PetSitterController {

	@Autowired
	private PetSitterService service;
}	
