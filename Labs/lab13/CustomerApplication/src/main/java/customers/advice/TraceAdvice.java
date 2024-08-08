package customers.advice;

import customers.integration.EmailSender;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

@Aspect
@Configuration
public class TraceAdvice {
    @After("execution(* *.*.EmailSender.sendEmail(..)) && args(to, message)")
    public void logAfterSendEmail(JoinPoint joinPoint, String to, String message) {
        EmailSender emailSender = (EmailSender) joinPoint.getTarget();

        String methodName = joinPoint.getSignature().getName();
        System.out.printf("method=%s address=%s message=%s outgoingMailServer=%s\n", methodName, to, message, emailSender.getOutgoingEmailServer());
    }

    @Around("execution(* *.dao.*.*(..))")
    public Object methodDuration(ProceedingJoinPoint proceeding) throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start();
        Object result = proceeding.proceed();
        sw.stop();
        System.out.printf("Time taken: %d milliseconds \n", sw.getTotalTimeMillis());
        return result;
    }
}
