package dev.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {
    @GetMapping("/")
    public String root() {
        return "hello from spring boot";
    }
}
