package ua.nic.landing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.nic.landing.model.CharacteristicEntity;

import java.util.List;

public interface ICharacteristicRepository extends JpaRepository<CharacteristicEntity, Integer> {
	List<CharacteristicEntity> findAllByProductId(Integer productId);
}
