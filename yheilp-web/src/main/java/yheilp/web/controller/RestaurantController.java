package yheilp.web.controller;

import yheilp.core.entity.Restaurant;
import yheilp.core.service.RestaurantService;
import yheilp.web.dto.RestaurantDTO;

import javax.ws.rs.*;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
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

   /* @GET
    @Path("")
    public Map<Long,String> findAllRestaurants(){
        return restaurantService.findAll().stream().collect(Collectors.toMap(Restaurant::getId, Restaurant::getTitle));
    } */

    @GET
    @Path("")
    public List<Restaurant> findAllRestaurants(){
        return restaurantService.findAll().stream().collect(Collectors.toList());
    }

    @GET
    @Path("/{restaurantId}")
    public RestaurantDTO findRestaurantDetails(@PathParam("restaurantId") long restaurantId){
        Restaurant restaurant = restaurantService.findRestaurantDetails(restaurantId);
        RestaurantDTO restaurantDTO = new RestaurantDTO();

        restaurantDTO.setId(restaurantId);
        restaurantDTO.setTitle(restaurant.getTitle());
        restaurantDTO.setImage(restaurant.getImage());
        restaurantDTO.setDescription(restaurant.getDescription());
        restaurantDTO.setLocation(restaurant.getLocation());
        restaurantDTO.setReviews(restaurant.getReviews());
        restaurantDTO.setContact(restaurant.getContact());
        return restaurantDTO;
    }

    @POST
    @Path("")
    public void saveRestaurant(Restaurant dto){
        restaurantService.save(dto);
    }

    @DELETE
    @Path("/{restaurantId}")
    public void deleteRestaurant(@PathParam("restaurantId")long restaurantId){
        restaurantService.delete(restaurantId);
    }

}
