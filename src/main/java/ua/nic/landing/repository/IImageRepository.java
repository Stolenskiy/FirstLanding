package ua.nic.landing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.nic.landing.model.ImageEntity;

public interface IImageRepository extends JpaRepository<ImageEntity, Integer> {
}
