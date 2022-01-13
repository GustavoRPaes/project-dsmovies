package com.rodrigues.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.dsmovies.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
