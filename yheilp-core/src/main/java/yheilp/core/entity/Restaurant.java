package yheilp.core.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Restaurant implements Comparable<Restaurant>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String image;

    private String title;

    private String description;

   /* @ManyToOne
    private Lieux lieux;

    @OneToMany
    private List<Note> notes;

    @OneToMany
    private List<Commentaire> commentaires;  */

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

   /* public String getLieux() { return lieux.toString(); }

    public void setLieux(Lieux lieux) {
        this.lieux = lieux;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }
*/
    @Override
    public int compareTo(Restaurant o) { return title.compareTo(o.title); }
}
