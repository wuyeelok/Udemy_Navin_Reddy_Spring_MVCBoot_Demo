package com.kenneth.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenneth.springmvcboot.model.ReddyAlien;

public interface ReddyAlienRepo extends JpaRepository<ReddyAlien, Integer> {
	// Note: must extend JpaRepository and T must be a entity

	public List<ReddyAlien> findByAnameOrderByAidDesc(String aname); // Query DSL

}
