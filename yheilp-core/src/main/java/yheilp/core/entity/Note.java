package yheilp.core.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int score;

    @ManyToOne
    @JoinTable(
            name = "note_restaurant",
            joinColumns = @JoinColumn(name = "note_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    private Lieux lieux;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Lieux getLieux() {
        return lieux;
    }

    public void setLieux(Lieux lieux) {
        this.lieux = lieux;
    }
}
