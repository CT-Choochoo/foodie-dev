package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceLogAspect {

  static final Logger logger = LoggerFactory.getLogger(ServiceLogAspect.class);
  /*
   * AOP通知
   * 1.前置通知：在方法调用之前执行
   * 2.后置通知：在方法正常调用之后执行
   * 3.环绕通知：在方法调用之前和之后都可以分别执行的通知
   * 4.异常通知：如果方法调用过程中发生异常，则通知
   * 5.最终通知：在方法调用之后执行
   *
   * 切面表达式
   * <p> 1. * 代表方法返回类型
   * <p>2. 包名代表aop监控的类所在的包
   * <p>3. .. 代表该包以及其子包下的所有类方法
   * <p>4. *代表类名，*代表所有类
   * <p>5. *(..) * 代表类中所有方法名（..）表示方法中的任何参数
   * */
  @Around("execution(* com.example.service..*.*(..))")
  public Object recordTimeLog(ProceedingJoinPoint joinPoint) throws Throwable {
    logger.info(
        "=======开始执行{}.{}==========",
        joinPoint.getTarget().getClass(),
        joinPoint.getSignature().getName());
    long begin = System.currentTimeMillis();
    Object proceed = joinPoint.proceed();
    long end = System.currentTimeMillis();
    long takeTime = end - begin;
    if (takeTime > 3000) {
      logger.error("================执行结束：耗时{}！=================",takeTime);
    } else if (takeTime > 2000) {
      logger.warn("================执行结束：耗时{}！=================",takeTime);
    } else{
      logger.info("================执行结束：耗时{}=================",takeTime);
    }
    return proceed;
  }
}
