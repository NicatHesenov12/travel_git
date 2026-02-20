package com.hesenov.hamburgacademy.repository;

import com.hesenov.hamburgacademy.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel,Long> {
}
