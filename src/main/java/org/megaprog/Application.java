package org.megaprog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Rafael R. S. Robles
 */
@SpringBootApplication
@ComponentScan(basePackages = {"org.megaprog.controller","org.megaprog.model.dao","org.megaprog.model.repository"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
