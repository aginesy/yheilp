package yheilp.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Lieux {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idlieux;

    private String name;

    private String country;

    private String description;

    public Long getIdlieux() { return idlieux; }

    public void setIdlieux(Long idlieux) { this.idlieux = idlieux; }

    @OneToMany
    private Set<Restaurant> restaurants;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public String toString() {
        return name +", " + country;
    }
}
