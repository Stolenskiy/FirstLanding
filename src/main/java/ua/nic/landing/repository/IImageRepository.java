package ua.nic.landing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ua.nic.landing.model.ImageEntity;
import ua.nic.landing.model.ProductEntity;

import java.util.List;
import java.util.Set;
@Repository
public interface IImageRepository extends JpaRepository<ImageEntity, Integer> {

	List<ImageEntity> findByProductIdInAndMainImage(List<Integer> productIds, boolean mainImage);
	List<ImageEntity> findByProductId(Integer productId);
}
