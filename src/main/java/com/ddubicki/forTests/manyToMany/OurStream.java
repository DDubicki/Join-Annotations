package com.ddubicki.forTests.manyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Stream")
public class OurStream {

    /*
        @ManyToMany - Bidirectional relationship - both entity has reference to another entity

        !!!
        None owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    /*
        @ManyToMany(mappedBy = "followedStreams") - create a field that owns the relationship (in the Stream entity)
     */

    @ManyToMany(mappedBy = "followedStreams")
    private List<Viewer> viewers = new ArrayList<>();

}
