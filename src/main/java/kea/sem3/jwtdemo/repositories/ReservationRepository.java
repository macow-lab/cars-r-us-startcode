package kea.sem3.jwtdemo.repositories;

import kea.sem3.jwtdemo.entity.Reservation;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ReservationRepository extends CrudRepository<Reservation, String> {

    List<Reservation> findAll();

    @Query("FROM Reservation SELECT * WHERE rentor_id = :rentor_id")
    List<Reservation> findByRentor(@Param("rentor_id") String rentor_id);

    List<Reservation> findByCreated();

    @Query("FROM Reservation SELECT * WHERE car_id = :car_id")
    List<Reservation> findByCarID(@Param("car_id") String car_id);
    
}
