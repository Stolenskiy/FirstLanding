package ua.nic.landing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.nic.landing.dto.ProductDTO;
import ua.nic.landing.model.ImageEntity;
import ua.nic.landing.model.ProductEntity;
import ua.nic.landing.repository.IImageRepository;
import ua.nic.landing.repository.IProductRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class IndexViewController {
	@Autowired
	private IProductRepository productRepository;
	@Autowired
	private IImageRepository imageRepository;

	@GetMapping("/")
	public String startPage(Model model) {
		List<ProductEntity> products = productRepository.findAll();
		List<Integer> productIds = products.stream().map(ProductEntity::getId).collect(Collectors.toList());
		Map<Integer, ImageEntity> mainImageByProductId = imageRepository.findByProductIdInAndMainImage(productIds, true)
				.stream().collect(Collectors.toMap(ImageEntity::getProductId, image -> image));
		model.addAttribute("products", products);
		model.addAttribute("selectedProduct", new ProductDTO());
		model.addAttribute("mainImageByProductId", mainImageByProductId);

		Integer inter = new Integer(5);
		return "index.html";
	}

	@GetMapping("/productDeteils{")
	public String secondPage(Model model) {
		return "index2.html";
	}
}
