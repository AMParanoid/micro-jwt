package com.microjwt.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
    
    @GetMapping("/")
    public String home(){
        return "Welcome to home Page, /authenticate to authenticate";
    }

}
