package com.hms.patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>(Arrays.asList(
            new Patient(31, 51, "Plumber", new Date(), null, null, "Lactose allergy", null, null),
            new Patient(31, 51, "Plumber", new Date(), null, null, "Lactose allergy", null, null)
    ));

    public List<Patient> getAllPatients() {
        return patients;
    }

    public Patient getPatient(int id){
        patients.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return new Patient();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public Patient editPatient(int id, Patient patient) {
        return patient;
    }

    public int deletePatient(int id) {
        patients.get(id);
        return id;
    }


}
