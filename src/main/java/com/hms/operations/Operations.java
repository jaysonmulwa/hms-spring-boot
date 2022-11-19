package com.hms.operations;
import com.hms.doctor.Doctor;

import java.util.Optional;

public class Operations implements StandardOperatingProcedure{
    public Optional<Doctor> doctor;

    Operations(Optional<Doctor> doc){
        this.doctor = doc;
    }
    @Override
    public boolean execute() {
        System.out.println("executed");
        return false;
    }
}
