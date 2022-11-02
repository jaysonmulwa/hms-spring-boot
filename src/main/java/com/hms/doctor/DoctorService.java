package com.hms.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctor() {
        List<Doctor> doctor = new ArrayList<>();
        doctorRepository.findAll().forEach(doctor::add);
        return doctor;
    }

    public Optional<Doctor> getDoctor(int id){
        Optional<Doctor> byId = doctorRepository.findById(id);
        return byId;
    }

    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void updateDoctor(int id, Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void deleteDoctor(int id) {
        doctorRepository.deleteById(id);
    }

}
