package com.undostres.dummy_email.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import com.undostres.dummy_email.models.EmailResponse;

@Slf4j
@RestController
@RequestMapping("/api")
public class DummyEmailController {
    
    @PostMapping(value = "/email/{email}")
    public ResponseEntity<EmailResponse> getUser(@PathVariable("email") String email){
        log.info("Intro email sent to: {}", email);
        return new ResponseEntity<EmailResponse>(new EmailResponse("Email sent", true), HttpStatus.OK);
    }
}
