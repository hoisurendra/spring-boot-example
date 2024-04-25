package com.hitachi.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloWorldController {

    @GetMapping("/welcome")
    public String printHello() {
        return "Hi Hello, Welcome to Web Page deployed using Jenkins Pipeline & Docker";
    }
}
