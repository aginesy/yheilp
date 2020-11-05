package yheilp.core.service;

import yheilp.core.dao.CommentaireDAO;
import yheilp.core.entity.Commentaire;
import yheilp.core.entity.Note;

import javax.inject.Named;
import javax.transaction.Transactional;

@Named
@Transactional
public class CommentaireService {

    private CommentaireDAO commentaireDAO;

    public CommentaireService(CommentaireDAO commentaireDAO) {
        this.commentaireDAO = commentaireDAO;
    }

    public void save(Commentaire dto) {
        commentaireDAO.save(dto);
    }

    public void delete(long commentaireId) {
        commentaireDAO.deleteById(commentaireId);
    }
}
