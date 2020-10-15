package yheilp.core.service;

import yheilp.core.dao.RestaurantDAO;
import yheilp.core.entity.Restaurant;

import java.util.List;

public class RestaurantService {

    private RestaurantDAO restaurantDAO;

    public RestaurantService(RestaurantDAO restaurantDAO) {
        this.restaurantDAO = restaurantDAO;
    }

    public List<Restaurant> findAll(){
        return restaurantDAO.findAll();
    }

    public Restaurant findRestaurantDetails(long restaurantId) {
        return restaurantDAO.getOneWithNoteLieuxAndCommentaire(restaurantId);
    }

}
