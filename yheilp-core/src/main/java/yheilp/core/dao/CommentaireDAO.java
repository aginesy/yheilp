package yheilp.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yheilp.core.entity.Commentaire;


public interface CommentaireDAO extends JpaRepository<Commentaire, Long> {
}
