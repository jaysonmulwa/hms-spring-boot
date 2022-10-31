package com.hms.department;

import java.util.Random;

public class Department {
    public int departmentId;
    public String departmentName;

    public Department (String departmentName) {
        Random rand = new Random();
        this.departmentId  = rand.nextInt(1000);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }
}
