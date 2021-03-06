package ua.nic.landing.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "image", schema = "public", catalog = "d47pkomav9lts4")
public class ImageEntity {
	private int id;
	private String expansion;
	private Integer productId;
	private Boolean mainImage;

	@Id
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "expansion", nullable = true, length = 10)
	public String getExpansion() {
		return expansion;
	}

	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}

	@Basic
	@Column(name = "product_id", nullable = true)
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Basic
	@Column(name = "main_image", nullable = true)
	public Boolean getMainImage() {
		return mainImage;
	}

	public void setMainImage(Boolean mainImage) {
		this.mainImage = mainImage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ImageEntity that = (ImageEntity) o;
		return id == that.id && Objects.equals(expansion, that.expansion) && Objects.equals(productId, that.productId) && Objects.equals(mainImage, that.mainImage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, expansion, productId, mainImage);
	}
}
