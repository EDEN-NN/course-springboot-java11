package com.walison.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walison.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
