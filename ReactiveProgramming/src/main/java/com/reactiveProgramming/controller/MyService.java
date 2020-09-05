package com.reactiveProgramming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	
	@Autowired
	Dao dao;
	public Product getProductById(long id) {
	List<Product> product=dao.getProductById(id);
		return product.get(0);
	}

}
