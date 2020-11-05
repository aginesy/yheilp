package yheilp.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties({ "notes", "commentaires" })
public class Restaurant implements Comparable<Restaurant>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idrestaurant;

    private String image;

    private String title;

    private String description;

    @ManyToOne
    @JoinTable(
            name = "restaurant_location",
            joinColumns = @JoinColumn(name = "restaurant_id"),
            inverseJoinColumns = @JoinColumn(name = "location_id"))
    private Location location;

    @OneToMany
    @JoinTable(
            name = "note_restaurant",
            joinColumns = @JoinColumn(name = "note_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    private Set<Note> notes;

    @OneToMany
    @JoinTable(
            name = "commentaire_restaurant",
            joinColumns = @JoinColumn(name = "commentaire_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    private Set<Commentaire> commentaires;

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

    public Long getIdrestaurant() {
        return idrestaurant;
    }

    public void setIdrestaurant(Long idrestaurant) {
        this.idrestaurant = idrestaurant;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    public Set<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Set<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    @Override
    public int compareTo(Restaurant o) { return title.compareTo(o.title); }
}
