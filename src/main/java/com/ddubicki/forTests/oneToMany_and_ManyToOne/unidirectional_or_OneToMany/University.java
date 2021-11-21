package com.ddubicki.forTests.oneToMany_and_ManyToOne.unidirectional_or_OneToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "University")
public class University {

    /*
        @OneToMany - Unidirectional relationship (only one entity have reference to another)

        !!!
        None owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /*
        @OneToMany(cascade = CascadeType.ALL) - each operation performed on University entity will be propagated to the
        associated entity (Student entity)

        @OneToMany(orphanRemoval = true) - remove associated entities when University will be removed

        @JoinColumn(name = "university_id") - will create foreign key in the table of Student entity with University id primary key
     */

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "university_id")
    private List<Student> students = new ArrayList<>();
}
