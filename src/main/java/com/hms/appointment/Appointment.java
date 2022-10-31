package com.hms.appointment;

import com.hms.payment.Payment;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Appointment {
    public int appointmentId;
    public Date appointmentDate;
    public String appointmentDescription;
    public int staffId;

    public ArrayList<Payment> paymentsList;

    public Appointment (Date _appointmentDate, String _appointmentDescription, int _staffId) {
        Random rand = new Random();
        appointmentId = rand.nextInt(1000);
        appointmentDate = _appointmentDate;
        appointmentDescription = _appointmentDescription;
        staffId = _staffId;
        ArrayList<Payment> _pl = new ArrayList<Payment>();
        this.paymentsList = _pl;
    }
}