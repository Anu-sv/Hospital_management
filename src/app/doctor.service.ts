import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Doctors } from './doctors';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {
  private baseUrl="http://localhost:8082/home/doctors";

  constructor(private httpClient:HttpClient) { }
  getAllDoctors(): Observable<Doctors[]>{
    return this.httpClient.get<Doctors[]>(`${this.baseUrl}`);

  }
  createDoctors(doctors: Doctors): Observable<any> {
    return this.httpClient.post(`${this.baseUrl}`, doctors);
  }
}
