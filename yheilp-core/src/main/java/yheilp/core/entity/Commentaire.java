package yheilp.core.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    @ManyToOne
    @JoinTable(
            name = "commentaire_restaurant",
            joinColumns = @JoinColumn(name = "commentaire_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    private Lieux lieux;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
