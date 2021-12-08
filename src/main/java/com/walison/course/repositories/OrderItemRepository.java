package com.walison.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walison.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
