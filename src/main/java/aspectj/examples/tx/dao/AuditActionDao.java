package aspectj.examples.tx.dao;

/**
 * Created by amy on 5/2/17.
 */
public class AuditActionDao {

    private int id;
    private String auditAction;
    private String entity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuditAction() {
        return auditAction;
    }

    public void setAuditAction(String auditAction) {
        this.auditAction = auditAction;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }
}
