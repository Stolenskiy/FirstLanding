package ua.nic.landing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.nic.landing.model.ProductEntity;
import ua.nic.landing.repository.IProductRepository;

@Controller
public class IndexViewController {
	@Autowired
	private IProductRepository productRepository;
	@GetMapping("/")
	public String startPage (Model model) {
		model.addAttribute("productCount", productRepository.findAll().size());
		/*ProductEntity newProduct = new ProductEntity();
		productRepository.save(newProduct);*/
		return "index.html";
	}
}
