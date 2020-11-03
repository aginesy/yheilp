package yheilp.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yheilp.core.entity.Lieux;

public interface LieuDAO extends JpaRepository<Lieux, Long> {
}
