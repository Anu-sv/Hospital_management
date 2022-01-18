import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Doctors } from './doctors';
import { Patients } from './patients';
//import 'rxjs/add/operator/catch';
//import 'rxjs/add/observable/throw';
import { catchError } from 'rxjs';
import { throwError } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PatientService {
  private baseUrl="http://localhost:8082/patients";

  constructor(private httpClient:HttpClient) { }

   getAllPatients(): Observable<Patients[]>{
    return this.httpClient.get<Patients[]>(`${this.baseUrl}`);

  }
  createPatients(patients: Patients): Observable<any> {
    return this.httpClient.post(`${this.baseUrl}`, patients);
  }
  getPatientById(id:number): Observable<Patients>{
    console.log("sssssss----");
    console.log(id);
    console.log("sssssss----");
    return this.httpClient.get<Patients>(`${this.baseUrl}/${id}`).pipe(catchError(this.handleError));

  }
 
 private handleError(error: HttpErrorResponse){
   if(error.status===0){
     console.error("o error",error.error);
     
   }else{
     console.error(`Backend returned code ${error.status}, body was:`, error.error)
   }
   return throwError("No Such Patient in the Database");
 }
 


 
}
