package com.ddubicki.forTests.manyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Viewer")
public class Viewer {

    /*
        @ManyToMany - Bidirectional relationship - both entity has reference to another entity

        !!!
        Owning side
        !!!
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;

    /*
        @JoinTable - association table (the third table that has two foreign key columns
        which are primary keys of two entities - OurStream and Viewer entities)

        @JoinTable(name = "followed_streams") - name of third table

        @JoinTable(joinColumns = @JoinColumn(name = "viewer_id")) - specified the name of
        the column which will store foreign key of the entity which is owning side (Viewer)

        @JoinTable(inverseJoinColumns = @JoinColumn(name = "stream_id")) - specified the name of
        the column which will store foreign key of the none owning side entity (OurStream)

     */

    @ManyToMany
    @JoinTable(
            name = "followed_streams",
            joinColumns = @JoinColumn(name = "viewer_id"),
            inverseJoinColumns = @JoinColumn(name = "stream_id")
    )
    private List<OurStream> followedStreams = new ArrayList<>();
}
