package ua.nic.landing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.nic.landing.model.ImageEntity;

import java.util.List;
@Repository
public interface IImageRepository extends JpaRepository<ImageEntity, Integer> {

	List<ImageEntity> findByProductIdInAndMainImage(List<Integer> productIds, boolean mainImage);
	List<ImageEntity> findByProductId(Integer productId);
}
