package aspectj.examples.dao.repositories;

import aspectj.examples.dao.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aziring
 */
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer>{

}
