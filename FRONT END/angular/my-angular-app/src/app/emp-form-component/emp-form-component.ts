import { Component } from '@angular/core';
import { ActivatedRoute, Route, Router,Params } from '@angular/router';
import { Observable } from 'rxjs';
import { Employee } from '../Employee';

@Component({
  selector: 'app-emp-form-component',
  standalone: false,
  templateUrl: './emp-form-component.html',
  styleUrl: './emp-form-component.css'
})
export class EmpFormComponent {
emp:Employee=
{empId:0,empName:"",address:"",gender:""};

addEmp():void{
  console.log(this.emp)
}

}
