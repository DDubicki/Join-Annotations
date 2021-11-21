package com.ddubicki.forTests.oneToOne.bidirectional;

import javax.persistence.*;

@Entity
@Table(name = "Owner")
public class Owner {

    /*
        @OneToOne - Bidirectional relationship - both entity has reference to another entity

        !!!
        Owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    /*
        @JoinColumn(name = "car_id") to specify the name of the column where the foreign key will be stored (in this table)

        @JoinColumn(referencedColumnName = "id") to reference to column name in the Car entity (from that column will be
         getting primary key)
     */

    @OneToOne
    @JoinColumn(
            name = "car_id",
            referencedColumnName = "id"
    )
    private Car car;
}
