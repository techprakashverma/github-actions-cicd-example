package com.pv.guthubaction.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class MessageController {

    @GetMapping
    public String getMessage(){
        return "Welcome to GitHub Action CICD example...";
    }
}
