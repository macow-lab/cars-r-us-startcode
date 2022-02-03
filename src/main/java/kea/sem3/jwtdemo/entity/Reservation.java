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

@Table(name = "reservation")
public class Reservation {
    @Id
    private String reservation_id;


    @Column(nullable = false, unique = true,length = 50)
    private String rentor_id;

    @Column(nullable = false, unique = true,length = 50)
    private String created;


    @Column(nullable = false, unique = true,length = 50)
    private String last_edited;

    @Column(nullable = false, unique = true,length = 50)
    private String price;

    @Column(nullable = false, unique = true,length = 50)
    private String car_id;
}
