package yheilp.web.controller;

import yheilp.core.entity.Restaurant;
import yheilp.core.service.RestaurantService;

import javax.ws.rs.*;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;
import java.util.stream.Collectors;

@Named
@Path("/restaurants")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RestaurantController implements RestController {

    private RestaurantService restaurantService;


    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GET
    @Path("")
    public Map<Long,String> findAllRestaurants(){
        return restaurantService.findAll().stream().collect(Collectors.toMap(Restaurant::getId, Restaurant::getTitle));
    }

    //Todo findRestaurantDetails

}