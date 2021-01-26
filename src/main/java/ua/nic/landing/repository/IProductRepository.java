package ua.nic.landing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.nic.landing.model.ProductEntity;

public interface IProductRepository extends JpaRepository<ProductEntity, Integer> {
}
