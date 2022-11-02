package com.hms.staff;

import com.hms.address.Address;
import com.hms.department.Department;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public String employmentStatus;
    public Date startDate;
    public Date endDate;
    public String education;
    public String certifications;
    public String languages;
    public Date birthDate;
    public Address address;
    public Department department;

    public Staff() {

    }
}
