package ua.nic.landing.dto;

import ua.nic.landing.model.ProductEntity;

public class ProductDTO {
	private int id;
	private String mainName;
	private float price;
	private String description;
	private Float rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMainName() {
		return mainName;
	}

	public void setMainName(String mainName) {
		this.mainName = mainName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public void clonWithEntity(ProductEntity product) {
		this.id = product.getId();
		this.mainName = product.getMainName();
		this.price = product.getPrice();
		this.rating = product.getRating();
		this.description = product.getDescription();
	}
}
