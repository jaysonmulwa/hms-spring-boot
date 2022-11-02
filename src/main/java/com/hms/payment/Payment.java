package com.hms.payment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Random;
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public String paymentMethod;
    public double paymentAmount;
    public String currencyCode;
    public int patientId;
    public int appointmentId;

    public Payment (String _paymentMethod, double _paymentAmount, String _currencyCode, int _patientId, int _appointmentId) {
        Random rand = new Random();
        this.id  = rand.nextInt(1000);
        paymentMethod = _paymentMethod;
        paymentAmount = _paymentAmount;
        currencyCode = _currencyCode;
        this.patientId = _patientId;
        appointmentId = _appointmentId;
    }

}