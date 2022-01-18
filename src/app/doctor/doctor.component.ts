import { Component, OnInit } from '@angular/core';
import { DoctorService } from '../doctor.service';
import { Doctors } from '../doctors';

@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.css']
})
export class DoctorComponent implements OnInit {
  doctors:Doctors=new Doctors();

  constructor(private doctorService: DoctorService) { }

  ngOnInit(): void {
  }
  saveDoctors(){
    this.doctorService.createDoctors(this.doctors).subscribe( (data:any) =>{
      console.log(data);
      //this.goToEmployeeList();
    });
    //,
   // error => console.log(error));
  }
  onSubmit(){
    console.log(this.doctors);
    this.saveDoctors();
    window.location.reload();
   
  }

}
