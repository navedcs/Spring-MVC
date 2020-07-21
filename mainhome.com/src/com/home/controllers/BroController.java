package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {

	//@ResponseBody // when we return string not file name.
	@RequestMapping("/cricketbat")
	public String getcricketbat() {
		//return "Le bhai cricket bat leja";
		return "MRFCricketbat";
		
	}
}
