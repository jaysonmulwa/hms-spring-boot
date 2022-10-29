package com.hms.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @RequestMapping("/patient")
    public String getPatients() {
        return "Hello world";
    }
}
