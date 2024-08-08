package miu.edu.lab13A.scheduling;

import customers.integration.ILogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;

@Configuration
public class ScheduledLogging {

    private ILogger logger;

    @Scheduled(fixedRate = 15000)
    public void triggerLog() {
        logger.log("Scheduled : " + LocalTime.now());
    }

    @Autowired
    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

}
