package yheilp.web.dto;

import yheilp.core.entity.Commentaire;
import yheilp.core.entity.Note;

import java.util.List;
import java.util.Set;

public class RestaurantDTO {

    private Long id;

    private String image;

    private String title;

    private String description;

    private String lieu;

    private Set<Note> notes;

    private Set<Commentaire> commentaires;

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

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

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(final Set<Note> noteScore) { notes = noteScore;}

    public Set<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(final Set<Commentaire> commentairesDescription) { commentaires = commentairesDescription;}


}
