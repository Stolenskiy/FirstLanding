package ua.nic.landing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.nic.landing.model.ImageEntity;
import ua.nic.landing.model.ProductEntity;
import ua.nic.landing.repository.IImageRepository;
import ua.nic.landing.repository.IProductRepository;

import java.util.List;

@Controller
public class ProductDetailsViewController {
	@Autowired
	private IProductRepository productRepository;
	@Autowired
	private IImageRepository imageRepository;

	@GetMapping("/productDetails")
	public String getDetailById (@RequestParam() int productId,	Model model) {
		ProductEntity product = productRepository.getOne(productId);
		List<ImageEntity> images = imageRepository.findByProductId(productId);
		model.addAttribute("product", product);
		model.addAttribute("images", images);
		return "product-details";
	}

}
