package com.walison.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walison.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
