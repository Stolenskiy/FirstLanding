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
		int size = productRepository.findAll().size();
		model.addAttribute("productCount", size);
		ProductEntity newProduct = new ProductEntity();
		newProduct.setMainName("name" + size);
		newProduct.setPrice(5);
		productRepository.save(newProduct);
		return "index.html";
	}
}
