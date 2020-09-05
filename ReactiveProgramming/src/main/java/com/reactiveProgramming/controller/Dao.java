package com.reactiveProgramming.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface Dao extends  CrudRepository<Product, Long>{

	@Transactional
	@Query(value="select * from Product where productId =:id", nativeQuery = true)
	List<Product> getProductById(long id);

}
