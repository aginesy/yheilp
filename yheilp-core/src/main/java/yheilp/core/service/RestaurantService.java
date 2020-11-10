package yheilp.core.service;

import yheilp.core.dao.RestaurantDAO;
import yheilp.core.entity.Restaurant;

import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Transactional
public class RestaurantService {

    private RestaurantDAO restaurantDAO;

    public RestaurantService(RestaurantDAO restaurantDAO) {
        this.restaurantDAO = restaurantDAO;
    }

    public List<Restaurant> findAll(){
        return restaurantDAO.findAll();
    }

    public Restaurant findRestaurantDetails(long restaurantId) {
        return restaurantDAO.getOneWithLocationReviewsContact(restaurantId);
    }

    public void save(Restaurant dto) {
        restaurantDAO.save(dto);
    }

    public void delete(long restaurantId) {
        restaurantDAO.deleteById(restaurantId);
    }

}
