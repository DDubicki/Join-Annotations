package com.ddubicki.forTests.oneToOne.bidirectional;

import javax.persistence.*;

@Entity
@Table(name = "Car")
public class Car {

    /*
        @OneToOne - Bidirectional relationship - both entity has reference to another entity

        !!!
        None owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;

    /*
        @OneToOne(mappedBy = "car") create a field that owns the relationship (in the Car entity)

     */
    @OneToOne(mappedBy = "car")
    private Owner owner;

}
