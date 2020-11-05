package yheilp.web.controller;

import yheilp.core.entity.Location;
import yheilp.core.service.LocationService;

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

}
