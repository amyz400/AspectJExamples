package aspectj.examples.tx.dao.service;

import aspectj.examples.tx.dao.EmployeeDao;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by amy on 5/2/17.
 */
@Transactional
public class EmployeeDaoService implements CrudService<EmployeeDao> {

    public Integer create(EmployeeDao entity) {
        Integer empId = null;

        return empId;
    }

    public EmployeeDao read(Integer id) {

        EmployeeDao findEmp = null;

        return findEmp;
    }

    public boolean update(EmployeeDao entity) {

        boolean success = true;

        return success;
    }

    public boolean delete(Integer id) {
        boolean success = true;

        return success;
    }
}
