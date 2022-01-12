package com.rodrigues.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.dsmovies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
