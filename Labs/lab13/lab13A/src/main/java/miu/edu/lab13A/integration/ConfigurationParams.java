package miu.edu.lab13A.integration;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "spring.application")
@Getter
@Setter
@Validated
@ToString
public class ConfigurationParams {
    @NotBlank
    private String applicationName;
    @NotBlank
    private String version;
    @NotBlank
    private String serverUrl;
    private String serverName;
    @Valid
    private Credential credential = new Credential();
    private List<String> countries;

    @Getter
    @Setter
    @ToString
    @Validated
    public class Credential {
        private String firstName;
        private String lastName;
        @NotBlank
        @Size(min = 8, max = 15)
        private String username;
        @NotBlank
        @Size(min = 8, max = 15)
        private String password;
    }

}
