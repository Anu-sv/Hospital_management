package com.example.hospitalDemo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalDemo.model.Patients;

import com.example.hospitalDemo.repository.PatientRepository;
@CrossOrigin(origins="http://localhost:4200")

@RestController
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	@GetMapping("/patients")
	
	public ArrayList<Patients> getAllPatients(){
		
		return (ArrayList<Patients>) patientRepository.findAll();
	}
	@PostMapping("/patients")
	public Patients savePatients(@RequestBody Patients patients) {
		return patientRepository.save(patients);
	
	}
	@GetMapping("/patients/{id}")
    public ResponseEntity<Patients> getUserById(@PathVariable(value = "id") long id) {
		Patients patient=null;
		
		 patient= patientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("patient not found by id :"+ResponseEntity.status(404)));
		
		return ResponseEntity.ok(patient);
	
     }


}
