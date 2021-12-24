package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.User;


public  interface UserRepository extends JpaRepository<User, Long> {
	



}
