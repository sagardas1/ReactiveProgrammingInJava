package com.reactiveProgramming.repo;

  
  import java.util.List;
  
  import org.springframework.data.jpa.repository.Query; import
  org.springframework.data.repository.CrudRepository; import
  org.springframework.stereotype.Repository; import
  org.springframework.transaction.annotation.Transactional;

import com.reactiveProgramming.controller.Product;
  
  
  
  @Transactional
  @Repository 
  public interface ProductDAO extends CrudRepository<Product, Long>{
  
  @Transactional
  @Query(value="select * from Product where productId =:id", nativeQuery =true) 
  List<Product> getProductById(long id);

  
  @Transactional
  @Query(value="select * from Product", nativeQuery =true) 
List<Product> getAllProduct();
  
  }
 