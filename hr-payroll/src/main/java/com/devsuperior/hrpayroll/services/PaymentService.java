package com.devsuperior.hrpayroll.services;

<<<<<<< HEAD


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
import com.devsuperior.hrpayroll.feignclients.WorkerFeignClient;
=======
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
>>>>>>> d3a899853e2325894556b89e6ae1284601c52605

@Service
public class PaymentService {
	
<<<<<<< HEAD
	@Autowired
	private WorkerFeignClient workerFeignClient;
	

	public Payment getPayment(long workerId, Integer days) {
				
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

=======
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(Long workerId, Integer days) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		Worker worker = restTemplate.getForObject(workerHost+"/workers/{id}", Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
>>>>>>> d3a899853e2325894556b89e6ae1284601c52605
}
