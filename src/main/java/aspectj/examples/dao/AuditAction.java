package aspectj.examples.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by amy on 5/2/17.
 */
@Entity
@Table(name = "AUDIT_ACTION")
public class AuditAction {

    private int id;
    private String auditAction;
    private String entity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name="AUDIT_ACTION")
    public String getAuditAction() {
        return auditAction;
    }
    public void setAuditAction(String auditAction) {
        this.auditAction = auditAction;
    }

    @Column(name="ENTITY")
    public String getEntity() {
        return entity;
    }
    public void setEntity(String entity) {
        this.entity = entity;
    }
}
