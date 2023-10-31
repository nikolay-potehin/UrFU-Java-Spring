package java.org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {

    @Around("execution(* java.org.example.dao.*.*(..))")
    public Object aroundAllRepMethodsAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Beginning of method: " + methodName);
        Object result = joinPoint.proceed();
        System.out.println("Ending of method: " + methodName);
        return result;
    }
}
