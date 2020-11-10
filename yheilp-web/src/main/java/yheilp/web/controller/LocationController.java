package yheilp.web.controller;

import yheilp.core.entity.Location;
import yheilp.core.entity.Restaurant;
import yheilp.core.service.LocationService;
import yheilp.web.dto.LocationDTO;
import yheilp.web.dto.RestaurantDTO;

import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Named
@Path("/locations")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LocationController implements RestController{

    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GET
    @Path("")
    public List<Location> findAllLocations(){
       return locationService.findAll().stream().collect(Collectors.toList());
    }

    @GET
    @Path("/{locationId}")
    public LocationDTO findLocationDetails(@PathParam("locationId") long locationId){
        Location location = locationService.findLocationDetails(locationId);
        LocationDTO locationDTO = new LocationDTO();

        locationDTO.setIdlocation(locationId);
        locationDTO.setCity(location.getCity());
        locationDTO.setCountry(location.getCountry());
        return locationDTO;
    }
}
