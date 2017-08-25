package aspectj.examples.tx.dao.repositories;

import aspectj.examples.tx.dao.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aziring on 8/25/17.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
