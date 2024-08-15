package com.starter.welcome;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class helloWorldController {
    
    
    @RequestMapping("/hi")
    public String HelloWord() {
        return "Hello World !!!";
    }
}
