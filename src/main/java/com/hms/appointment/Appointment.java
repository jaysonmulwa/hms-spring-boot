package com.hms.appointment;

import com.hms.payment.Payment;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public Date appointmentDate;
    public String appointmentDescription;
    public int staffId;

    public ArrayList<Payment> paymentsList;

    public Appointment (Date _appointmentDate, String _appointmentDescription, int _staffId) {
        Random rand = new Random();
        this.id = rand.nextInt(1000);
        this.appointmentDate = _appointmentDate;
        this.appointmentDescription = _appointmentDescription;
        this.staffId = _staffId;
        ArrayList<Payment> _paymentList = new ArrayList<Payment>();
        this.paymentsList = _paymentList;
    }
}