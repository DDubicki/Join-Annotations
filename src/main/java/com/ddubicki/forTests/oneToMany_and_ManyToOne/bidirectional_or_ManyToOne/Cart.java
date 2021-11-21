package com.ddubicki.forTests.oneToMany_and_ManyToOne.bidirectional_or_ManyToOne;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
public class Cart {

    /*
        @OneToMany - Bidirectional relationship - both entity has reference to another entity

        !!!
        None owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    /*
        @OneToMany(mappedBy = "cart") - create a field that owns the relationship (in the Cart entity)

        @OneToMany(cascade = CascadeType.ALL) - each operation performed on Cart entity will be propagated to the
        associated entity (Item entity)

        @OneToMany(orphanRemoval = true) - remove associated entities when Cart will be removed

    */
    @OneToMany(
            mappedBy = "cart",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Item> items = new ArrayList<>();
}
