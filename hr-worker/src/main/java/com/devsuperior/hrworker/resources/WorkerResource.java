package com.devsuperior.hrworker.resources;

import java.util.List;

<<<<<<< HEAD
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
=======
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> d3a899853e2325894556b89e6ae1284601c52605
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
<<<<<<< HEAD
	
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = repository.findAll();
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
		logger.info("PORT = " + env.getProperty("local.server.port"));
		Worker worker = repository.findById(id).get();
		
		return ResponseEntity.ok(worker);
	}

=======

	@Autowired
	private WorkerRepository workerRepository;

	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = workerRepository.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		Worker worker = workerRepository.findById(id).get();
		return ResponseEntity.ok(worker);
	}
>>>>>>> d3a899853e2325894556b89e6ae1284601c52605
}
