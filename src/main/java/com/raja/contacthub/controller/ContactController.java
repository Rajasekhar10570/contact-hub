package com.raja.contacthub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @GetMapping("/info")
    public ResponseEntity<String> getContactInfo(){
        return new ResponseEntity<>("Hello, this simple!", HttpStatus.OK);
    }
}
