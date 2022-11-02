package com.hms.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @RequestMapping("/appointment")
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @RequestMapping("/appointment/{id}")
    public Optional<Appointment> getAppointment(@PathVariable int id) {
        return appointmentService.getAppointment(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/appointment")
    public void addAppointment(@RequestBody Appointment appointment) {
        appointmentService.addAppointment(appointment);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/appointment/{id}")
    public void updateAppointment(@PathVariable int id, @RequestBody Appointment appointment) {
        appointmentService.updateAppointment(id, appointment);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/appointment/{id}")
    public void deleteAppointment(@PathVariable int id) {
        appointmentService.deleteAppointment(id);
    }
}
