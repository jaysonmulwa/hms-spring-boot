package com.hms.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/payment")
    public List<Payment> getAllPayment() {
        return paymentService.getAllPayment();
    }

    @RequestMapping("/payment/{id}")
    public Optional<Payment> getPayment(@PathVariable int id) {
        return paymentService.getPayment(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/payment")
    public void addPayment(@RequestBody Payment payment) {
        paymentService.addPayment(payment);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/payment/{id}")
    public void updatePayment(@PathVariable int id, @RequestBody Payment payment) {
        paymentService.updatePayment(id, payment);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/payment/{id}")
    public void deletePayment(@PathVariable int id) {
        paymentService.deletePayment(id);
    }
}
