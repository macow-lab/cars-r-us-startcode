package kea.sem3.jwtdemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter

@DiscriminatorValue("CAR")
@Table(name = "car")
public class Car {
    @Id
    private String carid;
    // Stelnummer

    @Column(nullable = false, unique = true,length = 50)
    private String make;

    @Column(nullable = false, unique = true,length = 50)
    private String model;

    @Column(nullable = false, unique = true,length = 50)
    private String rank;

    @Column(nullable = false, unique = true,length = 50)
    private double price;



    public Car(String car, String make, String model, String rank, double price) {
        this.carid = car;
        this.make = make;
        this.model = model;
        this.rank = rank;
        this.price = price;
    }

    
}
