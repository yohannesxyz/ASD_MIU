package miu.edu.lab13A.aop;

import miu.edu.lab13A.integration.EmailSender;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.context.annotation.Configuration;


import java.time.LocalTime;

@Aspect
@Configuration

public class EmailAspect {
//part a
//    @After("execution(* miu.edu.lab13A.integration.EmailSender.sendEmail(..))")
//    public void afterEmailSent(JoinPoint joinPoint) {
//        System.out.println(LocalTime.now()+" method="+ joinPoint.getSignature().getName());
//    }

//part b
//    @After("execution(* miu.edu.lab13A.integration.EmailSender.sendEmail(..)) && args(email, message)")
//    public void afterEmailSent(JoinPoint joinPoint, String email, String message) {
//        System.out.println(LocalTime.now()+" method="+ joinPoint.getSignature().getName() + " email="+email + " message="+message);
//    }

   //part c
// @After("execution(* miu.edu.lab13A.integration.EmailSender.sendEmail(..)) && args(email,message)")
//    public void afterEmailSent(JoinPoint joinpoint, String email, String message) {
//    EmailSender emailSender = (EmailSender) joinpoint.getTarget();
//    System.out.println(LocalTime.now()+" method="+ joinpoint.getSignature().getName() + " email="+email + " message="+message + " smtpOutgoingMailServer="+emailSender.getSmtpOutgoingMailServer());
//
//}

//    part d


}
