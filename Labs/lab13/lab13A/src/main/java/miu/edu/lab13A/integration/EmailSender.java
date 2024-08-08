package miu.edu.lab13A.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

   Logger logger;

    public String getSmtpOutgoingMailServer() {
        return smtpOutgoingMailServer;
    }

    public void setSmtpOutgoingMailServer(String smtpOutgoingMailServer) {
        this.smtpOutgoingMailServer = smtpOutgoingMailServer;
    }

    @Value("${smtp.outgoing.mail.server}")
    private String smtpOutgoingMailServer;

    @Autowired
    public EmailSender(Logger logger) {
        this.logger = logger;
    }

    public void sendEmail(String email, String message){
        System.out.println("Email sent to: " + email + " with Message=" + message);
//        logger.log("Email sent to: " + email + " with Message=" + message);
    }
}
