package yheilp.core.service;

import yheilp.core.dao.NoteDAO;
import yheilp.core.entity.Note;

import javax.inject.Named;
import javax.transaction.Transactional;

@Named
@Transactional
public class NoteService {

    private NoteDAO noteDAO;

    public NoteService(NoteDAO noteDAO) {
        this.noteDAO = noteDAO;
    }

    public void save(Note dto) {
        noteDAO.save(dto);
    }

    public void delete(long noteId) {
        noteDAO.deleteById(noteId);
    }
}