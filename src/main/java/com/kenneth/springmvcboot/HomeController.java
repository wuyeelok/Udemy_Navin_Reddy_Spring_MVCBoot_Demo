package com.kenneth.springmvcboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kenneth.springmvcboot.model.Alien;
import com.kenneth.springmvcboot.model.ReddyAlien;

@Controller
public class HomeController {

	@ModelAttribute
	public void modelData(Model m) {
		System.out.println("calling model data method");
		m.addAttribute("name", "XXXX");
	}

	@GetMapping("/")
	public String home() {
		System.out.println("calling home method");
		return "index";
	}

	@PostMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {

		int num3 = i + j;
		m.addAttribute("num3", num3);

		return "result";
	}

	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") ReddyAlien a) {
		System.out.println("calling addAlien method");
		return "result";
	}

	@GetMapping("getAliens")
	public String getAliens(Model m) {

		List<Alien> aliens = Arrays.asList(new ReddyAlien(101, "Navin"), new ReddyAlien(102, "Rose"));

		m.addAttribute("result", aliens);

		return "showAliens";
	}
}
