package yheilp.web.dto;

import yheilp.core.entity.Commentaire;
import yheilp.core.entity.Location;
import yheilp.core.entity.Note;

import java.util.List;
import java.util.Set;

public class RestaurantDTO {

    private Long idrestaurant;

    private String image;

    private String title;

    private String description;

    private Set<Note> notes;

    private Set<Commentaire> commentaires;

    private Location location;



    public Long getId() {
        return idrestaurant;
    }

    public void setIdrestaurant(Long idrestaurant) {
        this.idrestaurant = idrestaurant;
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

    /*public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(final Set<Note> noteScore) { notes = noteScore;}

    public Set<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(final Set<Commentaire> commentairesDescription) { commentaires = commentairesDescription;}

*/
}
