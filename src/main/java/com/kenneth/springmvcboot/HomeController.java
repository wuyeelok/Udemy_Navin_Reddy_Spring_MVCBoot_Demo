package com.kenneth.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}

	@PostMapping("add")
	public String add(HttpServletRequest req) {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int num3 = i + j;
		HttpSession session = req.getSession();

		session.setAttribute("num3", num3);

		return "result.jsp";
	}

}
