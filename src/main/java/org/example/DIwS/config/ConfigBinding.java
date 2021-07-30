package org.example.DIwS.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("springyml")
public class ConfigBinding {

    private String username;
    private String password;
    private String jdbcurl;

}
