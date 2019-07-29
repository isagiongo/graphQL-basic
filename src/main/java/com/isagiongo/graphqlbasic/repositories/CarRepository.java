package com.isagiongo.graphqlbasic.repositories;

import com.isagiongo.graphqlbasic.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
