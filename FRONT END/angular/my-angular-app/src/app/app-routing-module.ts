import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Employees } from './components/employees/employees';
import { LoginComponent } from './components/login-component/login-component';
import { EmpFormComponent } from './emp-form-component/emp-form-component';

const routes: Routes = [
  {
    path:"employees",
    component:Employees
  },
  {
    path:"empform",
    component:EmpFormComponent
  },
  { path: '', component: LoginComponent },  
  { path: 'login', component: LoginComponent },
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
