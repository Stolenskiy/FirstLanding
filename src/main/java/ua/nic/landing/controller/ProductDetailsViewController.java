package ua.nic.landing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.nic.landing.model.CharacteristicEntity;
import ua.nic.landing.model.ImageEntity;
import ua.nic.landing.model.ProductEntity;
import ua.nic.landing.repository.ICharacteristicRepository;
import ua.nic.landing.repository.IImageRepository;
import ua.nic.landing.repository.IProductRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class ProductDetailsViewController {
	@Autowired
	private IProductRepository productRepository;
	@Autowired
	private IImageRepository imageRepository;
	@Autowired
	private ICharacteristicRepository characteristicRepository;

	@GetMapping("/productDetails")
	public String getDetailById(@RequestParam() int productId, Model model) {
		List<ProductEntity> products = productRepository.findAll();
		List<ImageEntity> images = imageRepository.findByProductId(productId);
		List<CharacteristicEntity> characteristics = characteristicRepository.findAllByProductId(productId);
		model.addAttribute("product", products.get(productId));
		model.addAttribute("images", images);
		model.addAttribute("characteristics", characteristics);

		products.remove(products.get(productId));
		model.addAttribute("otherProducts", products);

		List<Integer> productIds = products.stream().map(ProductEntity::getId).collect(Collectors.toList());
		Map<Integer, ImageEntity> mainImageByProductId = imageRepository.findByProductIdInAndMainImage(productIds, true)
				.stream().collect(Collectors.toMap(ImageEntity::getProductId, image -> image));
		model.addAttribute("mainImageByProductId", mainImageByProductId);

		return "product-details";
	}

}
