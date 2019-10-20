package com.kenneth.springmvcboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kenneth.springmvcboot.model.Alien;
import com.kenneth.springmvcboot.model.ReddyAlien;

@Controller
public class AlienController {

	private ReddyAlienRepo repo;

	@Autowired
	public AlienController(ReddyAlienRepo repo) {
		this.repo = repo;
	}

	@GetMapping("aliens")
	@ResponseBody
	public List<Alien> getAliens(Model m) {

		List<Alien> aliens = new ArrayList<>();

		List<ReddyAlien> reddyAliens = this.repo.findAll();

		for (ReddyAlien r : reddyAliens) {
			aliens.add(r);
		}

		return aliens;
	}
}
