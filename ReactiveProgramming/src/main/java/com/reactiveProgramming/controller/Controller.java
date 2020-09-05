package com.reactiveProgramming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Controller {
	
	
	@Autowired
	MyService myService;
	
	@GetMapping(value="/getproductbyid/{id}")
	public Product getProductById(@PathVariable(value ="id")long id) {
		//restTemplate.getForObject("", String.class);
		return myService.getProductById(id);
	}
	

}
