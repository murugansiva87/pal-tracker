package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {

    @Value("${welcome.message}")
    String message;

    @GetMapping("/")
    @CrossOrigin
    /**
     *
     */
    public String sayHello() {
        return message;
    }
}