package com.kenneth.springmvcboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kenneth.springmvcboot.model.ReddyAlien;

@Controller
public class HomeController {

	private ReddyAlienRepo repo;

	@Autowired
	public HomeController(ReddyAlienRepo repo) {
		this.repo = repo;
	}

	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "XXXX");
	}

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
	public String addAlien(@ModelAttribute("a1") ReddyAlien a) {

		this.repo.save(a);

		return "result";
	}

	@GetMapping("getAliens")
	public String getAliens(Model m) {

		m.addAttribute("result", this.repo.findAll());

		return "showAliens";
	}

	@GetMapping("getAlien")
	public String getAlien(@RequestParam("alienId") int aid, Model m) {

		m.addAttribute("result", this.repo.getOne(aid));

		return "showAliens";
	}

	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam("aname") String aname, Model m) {

		m.addAttribute("result", this.repo.find(aname));

		return "showAliens";
	}
}
