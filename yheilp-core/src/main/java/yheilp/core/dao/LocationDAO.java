package yheilp.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import yheilp.core.entity.Location;
import yheilp.core.entity.Restaurant;

public interface LocationDAO extends JpaRepository<Location, Long> {

    @Query("SELECT DISTINCT l FROM Location l WHERE l.idlocation=:idlocation")
    Location getOneWithDetails(@Param("idlocation") long idlocation);
}
