package com.ddubicki.forTests.oneToMany_and_ManyToOne.bidirectional_or_ManyToOne;

import javax.persistence.*;

@Entity
@Table(name = "Item")
public class Item {

    /*
        @OneToMany - Bidirectional relationship - both entity has reference to another entity

        !!!
        Owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serialNumber;

    /*
        @JoinColumn(name = "cart_id") to specify the name of the column where the foreign key will be stored (in this table)

     */

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

}
