package com.hms.department;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Random;
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public String departmentName;

    public Department() {
    }

    public String getDepartmentName() {
        return this.departmentName;
    }
}
