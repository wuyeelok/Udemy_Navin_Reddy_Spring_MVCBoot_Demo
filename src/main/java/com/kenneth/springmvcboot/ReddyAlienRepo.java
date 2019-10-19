package com.kenneth.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kenneth.springmvcboot.model.ReddyAlien;

public interface ReddyAlienRepo extends JpaRepository<ReddyAlien, Integer> {
	// Note: must extend JpaRepository and T must be a entity

	public List<ReddyAlien> findByAnameOrderByAidDesc(String aname); // Query DSL

	@Query("from ReddyAlien where aname= :name")
	public List<ReddyAlien> find(@Param("name") String aname);

}
