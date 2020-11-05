package yheilp.web.controller;

import yheilp.core.entity.Commentaire;
import yheilp.core.service.CommentaireService;

import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Named
@Path("/commentaires")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentaireController implements RestController{

    private CommentaireService commentaireService;


    public CommentaireController(CommentaireService commentaireService) {
        this.commentaireService = commentaireService;
    }

    @POST
    @Path("")
    public void saveCommentaire(Commentaire dto){
        commentaireService.save(dto);
    }

    @DELETE
    @Path("/{commentaireId}")
    public void deleteCommentaire(@PathParam("commentaireId")long commentaireId){
        commentaireService.delete(commentaireId);
    }

}
