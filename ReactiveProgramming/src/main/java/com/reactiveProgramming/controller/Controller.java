package com.reactiveProgramming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("product")
public class Controller {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value="/getproductbyid/{id}")
	public String getProductById(@PathVariable(value ="id")long id) {
		restTemplate.getForObject("", String.class);
		return null;
	}
	

}
