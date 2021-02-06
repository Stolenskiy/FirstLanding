package ua.nic.landing.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "characteristics", schema = "public", catalog = "d47pkomav9lts4")
public class CharacteristicsEntity {
	private int id;
	private String title;
	private String value;
	private Integer productId;

	@Id
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "title", nullable = true, length = 50)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Basic
	@Column(name = "value", nullable = true, length = 30)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	@Column(name = "product_id", nullable = true)
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CharacteristicsEntity that = (CharacteristicsEntity) o;
		return id == that.id && Objects.equals(title, that.title) && Objects.equals(value, that.value) && Objects.equals(productId, that.productId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, value, productId);
	}
}
