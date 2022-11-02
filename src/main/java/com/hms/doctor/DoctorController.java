package com.hms.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/doctor")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @RequestMapping("/doctor/{id}")
    public Optional<Doctor> getDoctor(@PathVariable int id) {
        return doctorService.getDoctor(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/doctor")
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/doctor/{id}")
    public void updateDoctor(@PathVariable int id, @RequestBody Doctor doctor) {
        doctorService.updateDoctor(id, doctor);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/doctor/{id}")
    public void deleteDoctor(@PathVariable int id) {
        doctorService.deleteDoctor(id);
    }
}
