package com.hms.operations;

import com.hms.doctor.Doctor;
import com.hms.history.History;
import com.hms.history.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TreatPatient extends Operations {

    public TreatPatient(Optional<Doctor> doctor) {
        super(doctor);
    }

    @Override
    public boolean execute() {
        System.out.println("Patient treated");
        //Add to history
        return true;
    }
}
