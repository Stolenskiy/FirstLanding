package ua.nic.landing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.nic.landing.model.CharacteristicsEntity;

public interface ICharacteristicsRepository extends JpaRepository<CharacteristicsEntity, Integer> {
}
