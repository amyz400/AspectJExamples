package aspectj.examples.tx.dao.repositories;

import aspectj.examples.tx.dao.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aziring on 8/25/17.
 */
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer>{

}
