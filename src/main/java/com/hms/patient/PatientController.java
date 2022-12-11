package com.hms.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/patients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/patients/{id}")
    public Optional<Patient> getPatient(@PathVariable int id) {
        return patientService.getPatient(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST, value="/patients")
    public void addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.PUT, value="/patients/{id}")
    public void updatePatient(@PathVariable int id, @RequestBody Patient patient) {
        patientService.updatePatient(id, patient);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.DELETE, value="/patients/{id}")
    public void deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
    }
}
