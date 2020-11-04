package yheilp.core.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Restaurant implements Comparable<Restaurant>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idrestaurant;

    private String image;

    private String title;

    private String description;

    /*@ManyToOne
    private Lieux lieux;

    @OneToMany(mappedBy = "restaurant")
    private Set<Note> notes;

    @OneToMany(mappedBy = "restaurant")
    private Set<Commentaire> commentaires;

     */

    public Long getId() {
        return idrestaurant;
    }

    public void setId(Long idrestaurant) {
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

    /*public String getLieux() { return lieux.toString(); }

    public void setLieux(Lieux lieux) {
        this.lieux = lieux;
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
    }*/

    @Override
    public int compareTo(Restaurant o) { return title.compareTo(o.title); }
}
