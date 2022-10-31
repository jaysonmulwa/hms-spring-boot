package com.hms.patient;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
    public List<Patient> findByAddressFirstName(String firstName);
}
