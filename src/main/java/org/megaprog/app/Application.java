package org.megaprog.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rafael R. S. Robles on 19/06/16.
 */
@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    String home() {
        return "forward:/WebContent/index.html";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
