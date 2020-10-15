package yheilp.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yheilp.core.entity.Note;

public interface NoteDAO extends JpaRepository<Note, Long> {
}
