package com.example.hospitalDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="doctors")
public class Doctors {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="Gender")
	private char gender;
	@Column(name="Specialist_Field")
	private String specialistField;
	
	public Doctors(){
		
	}

	public Doctors(String name, int age, char gender, String specialistField) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialistField = specialistField;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSpecialistField() {
		return specialistField;
	}

	public void setSpecialistField(String specialistField) {
		this.specialistField = specialistField;
	}
	
	
}
