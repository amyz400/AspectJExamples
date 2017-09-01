package aspectj.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by aziring
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"aspectj.examples.dao", "aspectj.examples.services", "aspectj.examples.aspect", "aspectj.examples.dao"})
@EnableJpaRepositories("aspectj.examples.dao.repositories")
public class App {

  private static Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
    logger.info("STARTING APP...");
    boolean mybool = true;
  }
}
