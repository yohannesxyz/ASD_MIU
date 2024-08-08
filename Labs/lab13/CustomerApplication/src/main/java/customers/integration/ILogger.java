package customers.integration;

import org.springframework.stereotype.Component;

@Component
public interface ILogger {
    public void log(String message);

}
