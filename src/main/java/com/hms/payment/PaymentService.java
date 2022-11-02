package com.hms.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        List<Payment> payment = new ArrayList<>();
        paymentRepository.findAll().forEach(payment::add);
        return payment;
    }

    public Optional<Payment> getPayment(int id){
        Optional<Payment> byId = paymentRepository.findById(id);
        return byId;
    }

    public void addPayment(Payment payment) {
        paymentRepository.save(payment);
    }

    public void updatePayment(int id, Payment payment) {
        paymentRepository.save(payment);
    }

    public void deletePayment(int id) {
        paymentRepository.deleteById(id);
    }

}
