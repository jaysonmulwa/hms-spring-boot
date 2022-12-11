package com.hms.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/payment")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/payment/{id}")
    public Optional<Payment> getPayment(@PathVariable int id) {
        return paymentService.getPayment(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST, value="/payment")
    public void addPayment(@RequestBody Payment payment) {
        paymentService.addPayment(payment);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.PUT, value="/payment/{id}")
    public void updatePayment(@PathVariable int id, @RequestBody Payment payment) {
        paymentService.updatePayment(id, payment);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.DELETE, value="/payment/{id}")
    public void deletePayment(@PathVariable int id) {
        paymentService.deletePayment(id);
    }
}
