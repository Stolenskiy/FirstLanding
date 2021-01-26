package ua.nic.landing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexViewController {
	@GetMapping("/")
	public String startPage (Model model) {
		model.addAttribute("productCount", 5);
		return "index.html";
	}
}
