package ua.nic.landing.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "public", catalog = "LendingDB")
public class ProductEntity {
	private int id;
	private String mainName;
	private float price;
	private String description;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "main_name", nullable = false, length = 100)
	public String getMainName() {
		return mainName;
	}

	public void setMainName(String mainName) {
		this.mainName = mainName;
	}

	@Basic
	@Column(name = "price", nullable = false, precision = 0)
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Basic
	@Column(name = "description", nullable = true, length = -1)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ProductEntity that = (ProductEntity) o;
		return id == that.id && Float.compare(that.price, price) == 0 && Objects.equals(mainName, that.mainName) && Objects.equals(description, that.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, mainName, price, description);
	}
}
