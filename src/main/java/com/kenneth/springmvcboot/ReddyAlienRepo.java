package com.kenneth.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenneth.springmvcboot.model.ReddyAlien;

public interface ReddyAlienRepo extends JpaRepository<ReddyAlien, Integer> {
	// Note: must extend JpaRepository and T must be a entity
}
