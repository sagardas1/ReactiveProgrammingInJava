package com.reactiveProgramming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactiveProgramming.repo.ProductDAO;

@Service
public class MyService {

	
	@Autowired
	private ProductDAO myDao;
	public Product getProductById(long id) {
	List<Product> product=myDao.getProductById(id);
	
	

	
	
		return product.get(0);
	}
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int a[]= {1,2,3,2,3,2,4,5};
		
	}

}
