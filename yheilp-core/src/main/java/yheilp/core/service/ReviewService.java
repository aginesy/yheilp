package yheilp.core.service;

import yheilp.core.dao.ReviewDAO;
import yheilp.core.entity.Location;
import yheilp.core.entity.Review;

import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Transactional
public class ReviewService {

    private ReviewDAO reviewDAO;

    public ReviewService(ReviewDAO reviewDAO) {
        this.reviewDAO = reviewDAO;
    }

    public List<Review> findAll(){
        return reviewDAO.findAll();
    }

    public void save(Review dto) {
        reviewDAO.save(dto);
    }

    public void delete(long reviewId) {
        reviewDAO.deleteById(reviewId);
    }
}
