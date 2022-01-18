import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DoctorService } from '../doctor.service';
import { Doctors } from '../doctors';

@Component({
  selector: 'app-show-doctor',
  templateUrl: './show-doctor.component.html',
  styleUrls: ['./show-doctor.component.css']
})
export class ShowDoctorComponent implements OnInit {
  name:string;
  doctors: Doctors[];
doct:Doctors = new Doctors();
  constructor(private doctorService: DoctorService) { }

  ngOnInit(): void {
    this.getAllDoctors();
  }
  private getAllDoctors() {
    this.doctorService.getAllDoctors().subscribe(data => {
      this.doctors = data;
    })
  }
  

}
