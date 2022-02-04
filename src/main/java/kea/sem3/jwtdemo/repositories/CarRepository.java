package kea.sem3.jwtdemo.repositories;

import kea.sem3.jwtdemo.entity.Car;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CarRepository extends CrudRepository<Car, String>{
   
    List<Car> findByCarid(String id);

    List<Car> findAll();

    List<Car> findByMake(String maker);

    List<Car> findByModel(String model);

    List<Car> findByRank(String rank);


}
