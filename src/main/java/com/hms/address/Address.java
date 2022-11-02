package com.hms.address;

import jakarta.persistence.Entity;

import java.util.Date;
@Entity
public class Address {
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;
    private String gender;
    private String homeAddress;
    private String phone;
    private String kinContacts;

    public Address (String _title, String _firstName, String _middleName, String _lastName, Date _birthDate, String _gender, String _homeAddress, String _phone, String _kinContacts) {
        title = _title;
        firstName = _firstName;
        middleName = _middleName;
        lastName = _lastName;
        birthDate = _birthDate;
        gender = _gender;
        homeAddress = _homeAddress;
        phone = _phone;
        kinContacts = _kinContacts;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}