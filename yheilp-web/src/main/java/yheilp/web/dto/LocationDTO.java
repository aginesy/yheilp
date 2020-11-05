package yheilp.web.dto;

import yheilp.core.entity.Restaurant;

import java.util.Set;

public class LocationDTO {

    private Long idlocation;

    private String city;

    private String country;

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
}
