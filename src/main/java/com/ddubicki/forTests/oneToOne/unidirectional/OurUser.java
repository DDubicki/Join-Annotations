package com.ddubicki.forTests.oneToOne.unidirectional;

import javax.persistence.*;

@Entity
@Table(name = "OurUser")
public class OurUser {

    /*
        @OneToOne - Unidirectional relationship (only one entity have reference to another)

        !!!
        Owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    /*
        @JoinColumn(name = "address_id") to specify the name of the column where the foreign key will be stored (in this table)

        @JoinColumn(referencedColumnName = "id") to reference to column name in the Address entity (from that column will be
         getting primary key)
    */

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

}
