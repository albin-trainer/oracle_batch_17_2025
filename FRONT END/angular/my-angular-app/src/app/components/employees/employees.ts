import { Component,OnInit,ChangeDetectorRef  } from '@angular/core';
import { Employee } from '../../Employee';
import { Observable } from 'rxjs';
import { EmployeeService } from '../../employee-service';
@Component({
  selector: 'app-employees',
  standalone: false,
  templateUrl: './employees.html',
  styleUrl: './employees.css'
})
export class Employees implements OnInit  {
  //Future this data pulled from DB ....
  employees:Employee[]=[]
  orginal:Employee[]=[];
  search:string="Amit";
  searchEmps():void{
this.employees=this.orginal.filter((s:Employee)=>s.empName.toLowerCase().
indexOf(this.search.toLowerCase())>=0  || s.address.toLowerCase().indexOf(this.search.toLowerCase())>=0 );
  }

  constructor(private service:EmployeeService, private changeDetector:ChangeDetectorRef){
  }
      ngOnInit():void{
           this.service.getAllEmployees().subscribe(
             (emps:Employee[])=>{
               console.log(emps);
               this.employees=emps;
               this.orginal=emps;
               this.changeDetector.detectChanges();
              }
           );
      }

 
}
