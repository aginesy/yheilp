package yheilp.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@JsonIgnoreProperties({ "restaurants" })
public class Lieux {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String country;

    private String description;

    @OneToMany(mappedBy = "lieux")
    private List<Restaurant> restaurants;
}
