package com.hy.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${server.port}")
    String port;
    @GetMapping("/home")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
