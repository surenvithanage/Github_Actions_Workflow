package com.spring.aws.beanstalk.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class IndexController {

    @GetMapping
    public String index() {
        return "Welcome to Github Actions Workflow";
    }
}
