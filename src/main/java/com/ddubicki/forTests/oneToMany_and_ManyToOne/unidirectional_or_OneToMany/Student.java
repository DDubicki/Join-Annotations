package com.ddubicki.forTests.oneToMany_and_ManyToOne.unidirectional_or_OneToMany;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    /*
        @OneToMany - Unidirectional relationship (only one entity have reference to another)

        !!!
        Owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String indexNumber;
}
