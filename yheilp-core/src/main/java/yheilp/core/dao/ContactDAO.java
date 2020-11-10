package yheilp.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yheilp.core.entity.Contact;

public interface ContactDAO extends JpaRepository<Contact, Long> {
}
