package aspectj.examples.tx.dao.repositories;

import aspectj.examples.tx.dao.AuditAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aziring on 8/25/17.
 */
@Repository
public interface AuditActionRepository extends JpaRepository<AuditAction, Integer> {

}
