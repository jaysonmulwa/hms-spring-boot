package com.hms.staff;

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

    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;
    private String gender;
    private String homeAddress;
    private String phone;
    private String kinContacts;
    public String employmentStatus;
    public Date startDate;
    public Date endDate;
    public String education;
    public String certifications;
    public String languages;
    public String staffCategory; //doctor or nurse

    public Staff() {

    }
}
