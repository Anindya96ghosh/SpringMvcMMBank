package com.springmvc.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home.app")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/deposit.app")
	public String deposit() {
		return "depositForm";
	}
	
	@RequestMapping("/withdraw.app")
	public String withdraw() {
		return "withdrawForm";
	}
	
	@RequestMapping("/fundTransfer.app")
	public String fundTransfer() {
		return "fundTransferForm";
	}
	
	@RequestMapping("/searchAccount.app")
	public String searchAccount() {
		return "searchAccount";
	}
	
	
}
