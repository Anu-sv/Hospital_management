package com.example.hospitalDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalDemo.model.Doctors;
@Repository
public interface DoctorRepository extends JpaRepository<Doctors,Long>{

}
