package com.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class Bankdetails {
	
	
	String bankname ="Hdfc";
	
	String bankaddress = "Guntur";
	
	@GetMapping("/getBankName")
	public String getBankName() {
		return bankname;
		
	}
	
	@GetMapping("/getBankAddress")
	public String getBankAddress() {
		return bankaddress;
		
	}

	
}
