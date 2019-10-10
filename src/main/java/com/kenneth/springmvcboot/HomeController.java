package com.kenneth.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@PostMapping("add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");

		int num3 = i + j;
		mv.addObject("num3", num3);

		return mv;
	}

}
