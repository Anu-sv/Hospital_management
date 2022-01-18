package com.example.hospitalDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalDemo.model.Patients;
@Repository
public interface PatientRepository extends JpaRepository<Patients,Long>{

}
