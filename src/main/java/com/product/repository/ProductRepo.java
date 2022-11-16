package com.product.repository;

import com.product.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ProductRepo extends JpaRepository<Product,Integer> {
  
	
	Optional<Product> findByName(String name);
}
