package yheilp.core.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String image;

    private String title;

    private String description;

    @ManyToOne
    @JoinTable(
            name = "restaurant_lieux",
            joinColumns = @JoinColumn(name = "restaurant_id"),
            inverseJoinColumns = @JoinColumn(name = "lieux_id"))
    private Lieux lieux;

    @OneToMany(mappedBy = "restaurant")
    private List<Note> note;

    @OneToMany(mappedBy = "restaurant")
    private List<Commentaire> commentaire;

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

    public Lieux getLieux() {
        return lieux;
    }

    public void setLieux(Lieux lieux) {
        this.lieux = lieux;
    }

    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }

    public List<Commentaire> getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(List<Commentaire> commentaire) {
        this.commentaire = commentaire;
    }
}
