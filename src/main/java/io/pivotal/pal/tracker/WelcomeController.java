package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class WelcomeController {

    private final String WELCOME_MESSAGE;

    public WelcomeController (
            @Value("${WELCOME_MESSAGE:NOT SET}") String WELCOME_MESSAGE
    ) {
        this.WELCOME_MESSAGE = WELCOME_MESSAGE;
    }

    @GetMapping("/")
    public String sayHello() {
        return this.WELCOME_MESSAGE;
    }
}
