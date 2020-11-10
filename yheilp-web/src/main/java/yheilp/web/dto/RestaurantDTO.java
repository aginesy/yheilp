package yheilp.web.dto;

import yheilp.core.entity.Contact;
import yheilp.core.entity.Location;
import yheilp.core.entity.Review;

import java.util.Set;

public class RestaurantDTO {

    private Long id;

    private String image;

    private String title;

    private String description;

    private Set<Review> reviews;

    private Location location;

    private Contact contact;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(final Set<Review> reviewScore) { reviews = reviewScore;}

    public Contact getContact() { return contact;    }

    public void setContact(Contact contact) { this.contact = contact; }
}
