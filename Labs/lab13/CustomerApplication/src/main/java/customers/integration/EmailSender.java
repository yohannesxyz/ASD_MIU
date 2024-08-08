package customers.integration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailSender implements IEmailSender {
    private ILogger logger;

    @Value("${spring.application.email.outgoing}")
    @Setter
    @Getter
    private String outgoingEmailServer;

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void sendEmail(String to, String message) {
        System.out.println("Email sent to " + to + " with message: " + message);
        logger.log("Email sent to " + to + " with message: " + message);
    }
}
