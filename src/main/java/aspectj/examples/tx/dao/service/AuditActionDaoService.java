package aspectj.examples.tx.dao.service;

import aspectj.examples.tx.dao.AuditActionDao;

/**
 * Created by amy on 5/2/17.
 */
public class AuditActionDaoService implements CrudService<AuditActionDao> {

    public Integer create(AuditActionDao entity) {
        return null;
    }

    public AuditActionDao read(Integer id) {
        return null;
    }

    public boolean update(AuditActionDao entity) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
