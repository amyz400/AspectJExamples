package aspectj.examples.tx.dao.service;

import aspectj.examples.tx.dao.JobTitleDao;

/**
 * Created by amy on 5/2/17.
 */
public class JobTitleDaoService implements CrudService<JobTitleDao> {

    public Integer create(JobTitleDao entity) {
        Integer jobTitleId = null;

        return jobTitleId;
    }

    public JobTitleDao read(Integer id) {
        JobTitleDao jobTitleDao = null;

        return jobTitleDao;
    }

    public boolean update(JobTitleDao entity) {
        boolean success = true;

        return success;
    }

    public boolean delete(Integer id) {
        boolean success = true;

        return success;
    }
}
