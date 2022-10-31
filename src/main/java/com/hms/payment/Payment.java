package com.hms.payment;

import java.util.Random;

public class Payment {
    public int paymentId;
    public String paymentMethod;
    public double paymentAmount;
    public String currencyCode;
    public int patientId;
    public int appointmentId;

    public Payment (String _paymentMethod, double _paymentAmount, String _currencyCode, int _patientId, int _appointmentId) {
        Random rand = new Random();
        this.paymentId  = rand.nextInt(1000);
        paymentMethod = _paymentMethod;
        paymentAmount = _paymentAmount;
        currencyCode = _currencyCode;
        this.patientId = _patientId;
        appointmentId = _appointmentId;
    }

}