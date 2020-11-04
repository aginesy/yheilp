package yheilp.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import yheilp.core.entity.Restaurant;

public interface RestaurantDAO extends JpaRepository<Restaurant,Long> {

    @Query("SELECT DISTINCT r FROM Restaurant r ")
    Restaurant getOneWithNoteLieuxAndCommentaire(@Param("id") long restaurantId);
}

/* LEFT JOIN FETCH r.notes LEFT JOIN FETCH r.lieux WHERE r.id=:id */
