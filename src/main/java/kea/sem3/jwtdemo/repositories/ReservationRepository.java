package kea.sem3.jwtdemo.repositories;

import kea.sem3.jwtdemo.entity.Reservation;

import java.util.List;


import org.springframework.data.repository.CrudRepository;



public interface ReservationRepository extends CrudRepository<Reservation, String> {

    List<Reservation> findAll();

    List<Reservation> findByRentor(String rentor);

    List<Reservation> findByCreated(String created);

    List<Reservation> findByCarid(String carid);
    
}
