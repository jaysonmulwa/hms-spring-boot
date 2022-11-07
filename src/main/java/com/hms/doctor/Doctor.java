package com.hms.doctor;

import com.hms.department.Department;
import com.hms.history.History;
import com.hms.patient.Patient;
import com.hms.staff.Staff;
import jakarta.persistence.Entity;

import java.util.Date;
import java.util.Random;
@Entity
public class Doctor extends Staff {

    public String wardNumber;
    public String speciality;

    public Doctor() {
    }

    public boolean givePrescription (Patient patient) {
        patient.setPrescription("3 tablets, 3 times a day"); // gives prescription here
        //History history = new History(new Date(), "Prescription: 3 tablets, 3 times a day", this.id);
        //patient.historyList.add(history);
        return true;
    }

    public boolean treatPatient (Patient patient) {
        patient.setSickness("Malaria"); // diagnoses sickness here
        //History history = new History(new Date(), "Treated for: Malaria", this.id);
        //patient.historyList.add(history);
        return true;
    }
}