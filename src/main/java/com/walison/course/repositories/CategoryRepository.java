package com.walison.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walison.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
