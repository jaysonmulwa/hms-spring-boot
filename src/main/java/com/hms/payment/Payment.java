package com.hms.payment;

import jakarta.persistence.*;

import java.util.Random;
@Entity(name = "Payment")
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "payment_method")
    private String payment_method;
    /*public double payment_amt;
    public int appointment_id;
    public int payment_for;
    //public String currency_code;
    //public int patient_id;
    */

    public Payment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    /*public Payment (String _paymentMethod, double _paymentAmount, String _currencyCode, int _patientId, int _appointmentId) {
        paymentMethod = _paymentMethod;
        paymentAmount = _paymentAmount;
        currencyCode = _currencyCode;
        this.patientId = _patientId;
        appointmentId = _appointmentId;
    }*/

}