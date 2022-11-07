package com.hms.nurse;
import com.hms.department.Department;
import com.hms.history.History;
import com.hms.patient.Patient;
import com.hms.staff.Staff;
import jakarta.persistence.Entity;

import java.util.Date;
import java.util.Random;
@Entity
public class Nurse extends Staff {
    public String wardNumber;

    public Nurse() {
    }

    public boolean attendToPatient(Patient patient) {
        //History history = new History(new Date(), "Attended to by nurse", this.id);
        //patient.historyList.add(history);
        return true;
    }

    public boolean administerInjection(Patient patient) {
        //History history = new History(new Date(), "Received injection", this.id);
        //patient.historyList.add(history);
        return true;
    }
}
