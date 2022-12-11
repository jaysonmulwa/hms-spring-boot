package com.hms.payment;

import com.hms.patient.Patient;
import jakarta.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String payment_method;
    private double payment_amt;
    private int appointment_id;
    private String currency_code;

    private int patient_id;

    public Payment() {
    }


    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public double getPayment_amt() {
        return payment_amt;
    }

    public void setPayment_amt(double payment_amt) {
        this.payment_amt = payment_amt;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

}