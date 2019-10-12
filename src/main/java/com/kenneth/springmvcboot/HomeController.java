package com.kenneth.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kenneth.springmvcboot.model.Alien;
import com.kenneth.springmvcboot.model.ReddyAlien;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@PostMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {

		int num3 = i + j;
		m.addAttribute("num3", num3);

		return "result";
	}

	@PostMapping("addAlien")
	public String addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, Model m) {

		Alien a = new ReddyAlien();
		a.setAid(aid);
		a.setAname(aname);

		m.addAttribute("alien", a);

		return "result";
	}
}
