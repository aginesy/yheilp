package yheilp.web.controller;

import yheilp.core.entity.Note;
import yheilp.core.service.NoteService;

import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Named
@Path("/notes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class NoteController implements RestController{

    private NoteService noteService;


    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @POST
    @Path("")
    public void saveNote(Note dto){
        noteService.save(dto);
    }

    @DELETE
    @Path("/{noteId}")
    public void deleteReview(@PathParam("noteId")long noteId){
        noteService.delete(noteId);
    }

}
