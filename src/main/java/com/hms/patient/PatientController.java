package com.hms.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/patients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @RequestMapping("/patients/{id}")
    public Patient getPatient(@PathVariable int id) {
        return patientService.getPatient(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/patients")
    public void addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/patients/{id}")
    public void updatePatient(@PathVariable int id, @RequestBody Patient patient) {
        patientService.updatePatient(id, patient);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/patients/{id}")
    public void deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
    }
}
