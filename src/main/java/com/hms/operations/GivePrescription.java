package com.hms.operations;

import com.hms.doctor.Doctor;

import java.util.Optional;

public class GivePrescription extends Operations {

    public GivePrescription(Optional<Doctor> doctor) {
        super(doctor);
    }

    @Override
    public boolean execute() {
        System.out.println("Prescription given");
        return true;
    }
}
