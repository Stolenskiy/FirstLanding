package ua.nic.landing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.nic.landing.model.ProductEntity;
import ua.nic.landing.repository.IProductRepository;

import java.util.List;

@Controller
public class IndexViewController {
	@Autowired
	private IProductRepository productRepository;
	@GetMapping("/")
	public String startPage (Model model) {
//		List<ProductEntity> products = productRepository.findAll();
//		model.addAttribute("products", products);
		return "index.html";
	}
	@GetMapping("/2")
	public String secondPage (Model model) {
		return "index2.html";
	}
}
