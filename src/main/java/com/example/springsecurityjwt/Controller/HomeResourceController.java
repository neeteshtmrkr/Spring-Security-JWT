package com.example.springsecurityjwt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {

    @RequestMapping({"/hello"})
    public String hello(){
        return "<h2>Hello User, Welcome to the application!!</h2>";
    }
}
