package yheilp.core.service;

import yheilp.core.dao.ContactDAO;
import yheilp.core.entity.Contact;

import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Transactional
public class ContactService {

    private ContactDAO contactDAO;

    public ContactService(ContactDAO contactDAO) { this.contactDAO = contactDAO;}

    public List<Contact> findAll(){
        return contactDAO.findAll();
    }
}
