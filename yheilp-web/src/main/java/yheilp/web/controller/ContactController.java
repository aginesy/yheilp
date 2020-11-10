package yheilp.web.controller;


import yheilp.core.entity.Contact;
import yheilp.core.service.ContactService;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Named
@Path("/contacts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContactController implements RestController {

    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GET
    @Path("")
    public List<Contact> findAllContacts(){
        return contactService.findAll().stream().collect(Collectors.toList());
    }
}
