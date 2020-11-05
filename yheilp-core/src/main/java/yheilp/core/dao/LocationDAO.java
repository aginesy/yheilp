package yheilp.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yheilp.core.entity.Location;

public interface LocationDAO extends JpaRepository<Location, Long> {
}
