package com.hms.patient;

import com.hms.appointment.Appointment;
import com.hms.history.History;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@Entity
public class Patient {
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
    private int age;
    private int weight;
    private String occupation;
    private Date dateAdmitted;
    private String sickness;
    private String prescription;
    private String allergies;
    private String specialRequests;

    //public Address address;
    //public ArrayList<History> historyList;
    //public ArrayList<Appointment> appointmentList;

    public Patient() {
    }

    /*public Patient (int age, int weight, String occupation, Date dateAdmitted, String sickness, String prescription, String allergies, String specialRequests, Address address) {
        this.age = age;
        this.weight = weight;
        this.occupation = occupation;
        this.dateAdmitted = dateAdmitted;
        this.sickness = sickness;
        this.prescription = prescription;
        this.allergies = allergies;
        this.specialRequests = specialRequests;
        //this.address = address;

        /*ArrayList<History> _hs = new ArrayList<History>();
        this.historyList = _hs;

        ArrayList<Appointment> _appList = new ArrayList<Appointment>();
        this.appointmentList = _appList;*/
    //}

    /*public void bookAppointment(Appointment appointment) {
        this.appointmentList.add(appointment);
    }*/

    /*public void makePayment(Payment payment, Appointment appointment) {
        appointment.paymentsList.add(payment);
    }*/

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Object getId() {
        return this.id;
    }
}
