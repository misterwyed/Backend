package com.lcwd.user.service.testing.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String Greeting(){
        return "Hello World";
    }
}
