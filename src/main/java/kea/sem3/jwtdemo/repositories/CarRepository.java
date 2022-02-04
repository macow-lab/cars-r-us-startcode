package kea.sem3.jwtdemo.repositories;

import kea.sem3.jwtdemo.entity.Car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CarRepository extends JpaRepository<Car, String>{
    
    List<Car> findByCarid(String id);

    List<Car> findAll();

    List<Car> findByMake(String maker);

    List<Car> findByModel(String model);

    List<Car> findByRank(String rank);


}
