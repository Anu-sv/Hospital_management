import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscriber } from 'rxjs';
import { PatientService } from '../patient.service';
import { Patients } from '../patients';

@Component({
  selector: 'app-show-patient',
  templateUrl: './show-patient.component.html',
  styleUrls: ['./show-patient.component.css']
})
export class ShowPatientComponent implements OnInit {
  id: number;
  //name: string;
  public errorMessage: string | undefined = undefined;

  patients: Patients=new Patients();

  constructor(private patientService:PatientService,private route: ActivatedRoute) { }

  ngOnInit(): void {
        
  }
 method(id){
   this.id=parseInt(id);
   this.id=this.route.snapshot.params['id'];
    
        this.patients = new Patients();
        this.patientService.getPatientById(id).subscribe( 
         
          data =>{
           
          this.patients= data;
          console.log("hellow" );
          console.log(data );
       },
       
       error => {
         this.errorMessage=error;
     
        } );

      }   

  
}
