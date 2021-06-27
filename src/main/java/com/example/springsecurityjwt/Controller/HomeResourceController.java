package com.example.springsecurityjwt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeResourceController {

    @RequestMapping("/hello")
    public String hello(){
        return "<h2>Hello World!!</h2>";
    }
}
