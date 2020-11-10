package yheilp.web.controller;

import yheilp.core.entity.Location;
import yheilp.core.entity.Review;
import yheilp.core.service.ReviewService;

import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Named
@Path("/reviews")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReviewController implements RestController{

    private ReviewService reviewService;


    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GET
    @Path("")
    public List<Review> findAllReviews(){
        return reviewService.findAll().stream().collect(Collectors.toList());
    }

    @POST
    @Path("")
    public void saveReview(Review dto){
        reviewService.save(dto);
    }

    @DELETE
    @Path("/{reviewId}")
    public void deleteReview(@PathParam("reviewId")long reviewId){
        reviewService.delete(reviewId);
    }

}
