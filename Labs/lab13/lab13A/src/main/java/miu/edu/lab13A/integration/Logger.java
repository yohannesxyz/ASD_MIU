package miu.edu.lab13A.integration;

import org.springframework.stereotype.Component;

@Component
public class Logger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("Message logged: "+message);
    }
}
