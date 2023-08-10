package com.example.crmvaadin;

import com.example.crmvaadin.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class CrmVaadinApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CrmVaadinApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {};}
}
