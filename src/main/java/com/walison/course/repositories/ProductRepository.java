package com.walison.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walison.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
