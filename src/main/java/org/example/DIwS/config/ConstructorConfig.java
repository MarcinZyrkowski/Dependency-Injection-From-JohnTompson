package org.example.DIwS.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Data
@ConfigurationProperties("springyml")
@ConstructorBinding
public class ConstructorConfig {

    private final String username;
    private final String password;
    private final String jdbcurl;

}
