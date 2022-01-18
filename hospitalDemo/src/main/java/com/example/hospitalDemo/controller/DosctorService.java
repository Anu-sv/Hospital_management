package com.example.hospitalDemo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.hospitalDemo.model.Doctors;
import com.example.hospitalDemo.model.Patients;
import com.example.hospitalDemo.repository.DoctorRepository;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/home")
public class DosctorService {
	@Autowired
	private DoctorRepository doctorRepository;
	@GetMapping("/doctors")
	public ArrayList<Doctors> getAllDoctors(){
		
		return (ArrayList<Doctors>) doctorRepository.findAll();
	}
	@PostMapping("/doctors")
	public Doctors savePatients(@RequestBody Doctors doctors) {
		return doctorRepository.save(doctors);
	
	}

}
