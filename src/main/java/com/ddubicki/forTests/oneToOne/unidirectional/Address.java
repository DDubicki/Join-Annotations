package com.ddubicki.forTests.oneToOne.unidirectional;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

    /*
        @OneToOne - Unidirectional relationship (only one entity have reference to another)

        !!!
        None owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;

}
