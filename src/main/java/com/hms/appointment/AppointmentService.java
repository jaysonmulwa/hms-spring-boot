package com.hms.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointment() {
        List<Appointment> appointment = new ArrayList<>();
        appointmentRepository.findAll().forEach(appointment::add);
        return appointment;
    }

    public Optional<Appointment> getAppointment(int id){
        Optional<Appointment> byId = appointmentRepository.findById(id);
        return byId;
    }

    public void addAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    public void updateAppointment(int id, Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    public void deleteAppointment(int id) {
        appointmentRepository.deleteById(id);
    }

}
