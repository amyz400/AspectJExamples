package aspectj.examples.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by aziring
 */
@Aspect
@Component
public class LoggerAspect {

  private static Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

  // if @Around and @Before are allocated to the same class, the @Around takes precedence and the
  // @Before will fire
 // @Around("execution(* aspectj.examples..*(..))")
  public void logEntry(ProceedingJoinPoint pjp) {

    String logStatement = pjp.getSignature().getName() + " entry";

    logger.info(logStatement);

  }

  // using Advice
  @Before("execution (* aspectj.examples.services..*(..))")
  public void logBefore(JoinPoint jp) {
    String logStatement = jp.getSignature().getName() + " entry: Before";

    logger.info(logStatement);
  }

  @After("execution (* aspectj.examples.services..*(..))")
  public void logAfter(JoinPoint jp) {
    String logStatement = jp.getSignature().getName() + " exit: After";

    logger.info(logStatement);
  }
}
