package yheilp.core.service;

import yheilp.core.dao.LocationDAO;
import yheilp.core.entity.Location;

import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Transactional
public class LocationService {

    private LocationDAO locationDAO;

    public LocationService(LocationDAO locationDAO) { this.locationDAO = locationDAO;}

    public List<Location> findAll(){
        return locationDAO.findAll();
    }
}
