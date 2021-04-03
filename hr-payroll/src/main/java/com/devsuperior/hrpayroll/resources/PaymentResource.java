package com.devsuperior.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.services.PaymentService;

<<<<<<< HEAD

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
=======
@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

>>>>>>> d3a899853e2325894556b89e6ae1284601c52605
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
		Payment payment = paymentService.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
<<<<<<< HEAD
=======
	
>>>>>>> d3a899853e2325894556b89e6ae1284601c52605
}
