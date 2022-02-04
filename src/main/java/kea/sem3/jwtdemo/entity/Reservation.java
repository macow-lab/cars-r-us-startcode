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
    private String reservationid;


    @Column(nullable = false, unique = true,length = 50)
    private String created;

    @Column(nullable = false, unique = true,length = 50)
    private String rentor;


    @Column(nullable = false, unique = true,length = 50)
    private String lastEdited;

    @Column(nullable = false, unique = true,length = 50)
    private String price;

    @Column(nullable = false, unique = true,length = 50)
    private String carid;
}
