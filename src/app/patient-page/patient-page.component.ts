import { Component, OnInit } from '@angular/core';
import { DoctorService } from '../doctor.service';
import { Doctors } from '../doctors';
import { PatientService } from '../patient.service';
import { Patients } from '../patients';

@Component({
  selector: 'app-patient-page',
  templateUrl: './patient-page.component.html',
  styleUrls: ['./patient-page.component.css']
})
export class PatientPageComponent implements OnInit {
  name:string;
  visitedDoctor:string;
  dateOfVisit:Date;

  doctors: Doctors[];
  patients: Patients = new Patients();
  constructor(private doctorService: DoctorService,private patientService: PatientService) { }

  ngOnInit(): void {
    this.getAllDoctors();
   // this.createPatients();

  }
  private getAllDoctors() {
    this.doctorService.getAllDoctors().subscribe(data => {
      this.doctors = data;
    })
  }
  savePatients(){
    this.patientService.createPatients(this.patients).subscribe( (data:any) =>{
      console.log(data);
      //this.goToEmployeeList();
    });
    //,
   // error => console.log(error));
  }

  onSubmit(){
    console.log(this.patients);
    this.savePatients();
    window.location.reload();
   
  }


}
