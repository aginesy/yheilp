package yheilp.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@JsonIgnoreProperties({ "restaurants" })
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idlocation;

    private String city;

    private String country;

    @OneToMany
    private Set<Restaurant> restaurants;

    public Long getIdlocation() {
        return idlocation;
    }

    public void setIdlocation(Long idlocation) {
        this.idlocation = idlocation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public String toString() { return city +", " + country; }
}
