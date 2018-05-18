package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value="/")
    public String sayHello()
    {
        return "Hello World";
    }

    @GetMapping(value="/endpoint")
    public String endpointHandler()
    {
        return "This is \"/endpoint\" path inside of endpoint";
    }
}
