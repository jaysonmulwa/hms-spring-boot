package com.hms.patient;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PatientService {
    private List<Patient> patients = new ArrayList<>(Arrays.asList(
            new Patient(31, 51, "Plumber", new Date(), null, null, "Lactose allergy", null, null),
            new Patient(31, 51, "Plumber", new Date(), null, null, "Lactose allergy", null, null)
    ));

    public List<Patient> getAllPatients() {
        return patients;
    }

    public Patient getPatient(int id){
        return patients.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void updatePatient(int id, Patient patient) {
        for (int i =0; i < patients.size(); i++) {
            Patient p = patients.get(i);
            if (p.getId().equals(id)){
                patients.set(i, patient);
                return;
            }
        }
    }

    public void deletePatient(int id) {
        patients.removeIf(p -> p.getId().equals(id));
    }


}
