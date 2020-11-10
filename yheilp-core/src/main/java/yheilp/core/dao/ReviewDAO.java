package yheilp.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yheilp.core.entity.Review;

public interface ReviewDAO extends JpaRepository<Review, Long> {
}
