package org.megaprog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rafael R. S. Robles
 */
@RestController
public class Rest {

    @RequestMapping("/")
    public String home() {
        return "Test!!!!!";
    }
}
