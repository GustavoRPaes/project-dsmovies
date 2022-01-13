package com.rodrigues.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.dsmovies.entities.Score;
import com.rodrigues.dsmovies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
