package kea.sem3.jwtdemo.repositories;

import kea.sem3.jwtdemo.entity.Car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CarRepository extends JpaRepository<Car, String>{
    
    // Bruger LIKE for at hjælpe brugervenlighed
    @Query("SELECT * FROM car WHERE car_id LIKE %id%")
    Car findByCarID(@Param("id") String id);

    List<Car> findAll();

    List<Car> findByMakers(String maker);

    List<Car> findByModel(String model);

    List<Car> findByRank(String rank);


}
