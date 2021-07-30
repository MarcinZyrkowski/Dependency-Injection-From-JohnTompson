package org.example.DIwS.config;

import org.example.DIwS.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@PropertySource("classpath:datasource.properties")
// if we want to use data from property file different than application.property
@Configuration
public class Config {

//    @Bean
//    FakeDataSource fakeDataSource(@Value("${username}") String username,
//                                  @Value("${password}") String password,
//                                  @Value("${jbdcurl}") String jbdcurl) {
//        FakeDataSource fakeDataSource = new FakeDataSource();
//        fakeDataSource.setUsername(username);
//        fakeDataSource.setPassword(password);
//        fakeDataSource.setJdbcurl(jbdcurl);
//
//        return fakeDataSource;
//    }

    @Bean
    FakeDataSource fakeDataSource(ConfigBinding configBinding) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(configBinding.getUsername());
        fakeDataSource.setPassword(configBinding.getPassword());
        fakeDataSource.setJdbcurl(configBinding.getJdbcurl());
        return fakeDataSource;
    }

}
