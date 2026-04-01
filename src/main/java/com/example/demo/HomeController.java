package main.java.com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String home() {
        return "Hello Everyone";
    }

}
