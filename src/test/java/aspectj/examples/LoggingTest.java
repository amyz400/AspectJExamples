package aspectj.examples;

import aspectj.examples.services.DemoServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by aziring on 8/29/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggingTest {

  @Autowired
  private DemoServices demoServices;

  @Test
  public void testLoggingEntryExit() {
    demoServices.processData();
  }

}
