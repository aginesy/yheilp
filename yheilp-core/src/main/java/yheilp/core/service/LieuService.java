package yheilp.core.service;

import yheilp.core.dao.LieuDAO;
import yheilp.core.entity.Lieux;

import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Transactional
public class LieuService {

    private LieuDAO lieuDAO;

    public LieuService(LieuDAO lieuDAO) {
        this.lieuDAO = lieuDAO;
    }
}
