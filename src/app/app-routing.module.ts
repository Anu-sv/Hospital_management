import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DoctorComponent } from './doctor/doctor.component';
import { LoginComponent } from './login/login.component';
import { PatientPageComponent } from './patient-page/patient-page.component';
import { ShowDoctorComponent } from './show-doctor/show-doctor.component';
import { ShowPatientComponent } from './show-patient/show-patient.component';

const routes: Routes = [
  //{path:'login',component: LoginComponent},
 
  {path:'', component: LoginComponent},
  {path:'Patients' , component: PatientPageComponent},
  {path: 'showDoctors', component: ShowDoctorComponent},
  {path: 'showPatients' , component: ShowPatientComponent},
  {path: 'showPatients/:id' , component: ShowPatientComponent},
  {path: 'Doctors' , component: DoctorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
