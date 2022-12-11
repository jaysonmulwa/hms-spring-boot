package com.hms.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/doctor")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/doctor/{id}")
    public Optional<Doctor> getDoctor(@PathVariable int id) {
        return doctorService.getDoctor(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST, value="/doctor")
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.PUT, value="/doctor/{id}")
    public void updateDoctor(@PathVariable int id, @RequestBody Doctor doctor) {
        doctorService.updateDoctor(id, doctor);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.DELETE, value="/doctor/{id}")
    public void deleteDoctor(@PathVariable int id) {
        doctorService.deleteDoctor(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST, value="/doctor/{id}/operation/{operation}/patient/{patient}")
    public void doOperation(@PathVariable int id, @PathVariable String operation, @PathVariable int patient) {
        Optional<Doctor> doctor = doctorService.getDoctor(id);
        doctorService.doOperation(doctor, operation, patient);
    }
}
