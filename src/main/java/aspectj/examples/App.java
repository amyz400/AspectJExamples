package aspectj.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by aziring on 8/25/17.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("aspectj.examples.tx.dao")
@EnableJpaRepositories("aspectj.examples.tx.dao.repositories")
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
    boolean mybool = true;
  }
}
