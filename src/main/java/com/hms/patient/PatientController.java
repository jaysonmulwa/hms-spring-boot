package com.hms.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/patient")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @RequestMapping("/patient/{id}")
    public Patient getPatient(@PathVariable int id) {
        return patientService.getPatient(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/patient")
    public void addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/patient/{id}")
    public void editPatient(@PathVariable int id, @RequestBody Patient patient) {

    }

    @RequestMapping(method = RequestMethod.DELETE, value="/patient/{id}")
    public void addPatient(@PathVariable int id) {

    }
}
