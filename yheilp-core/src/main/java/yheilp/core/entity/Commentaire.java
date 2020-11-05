package yheilp.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({ "restaurant" })
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idcommentaire;

    private String description;

    @ManyToOne
    private Restaurant restaurant;

    public Long getId() {
        return idcommentaire;
    }

    public void setId(Long idcommentaire) {
        this.idcommentaire = idcommentaire;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }


}
