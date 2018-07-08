package org.columbia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.columbia.service")
public class RumorMillApplication {
    public static void main(String[] args) {
        SpringApplication.run(RumorMillApplication.class, args);
    }
}
