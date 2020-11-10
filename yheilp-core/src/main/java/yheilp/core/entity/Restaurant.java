package yheilp.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"reviews"})
public class Restaurant implements Comparable<Restaurant>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String image;

    private String title;

    private String description;

    @ManyToOne
    @JoinTable(
            name = "restaurant_location",
            joinColumns = @JoinColumn(name = "idrestaurant"),
            inverseJoinColumns = @JoinColumn(name = "idlocation"))
    private Location location;

    @OneToMany(mappedBy = "restaurant")
    private Set<Review> reviews;


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }


    @Override
    public int compareTo(Restaurant o) { return title.compareTo(o.title); }
}
