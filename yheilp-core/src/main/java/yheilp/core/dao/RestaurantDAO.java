package yheilp.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import yheilp.core.entity.Restaurant;

public interface RestaurantDAO extends JpaRepository<Restaurant,Long> {

    @Query("SELECT DISTINCT r FROM Restaurant r LEFT JOIN FETCH r.location LEFT JOIN FETCH r.reviews LEFT JOIN FETCH r.contact  WHERE r.id=:id")
    Restaurant getOneWithLocationReviewsContact(@Param("id") long restaurantId);
}
