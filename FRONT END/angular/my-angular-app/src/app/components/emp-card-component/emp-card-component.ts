import { Component,Input } from '@angular/core';
import { Employee } from '../../Employee';

@Component({
  selector: 'app-emp-card-component',
  standalone: false,
  templateUrl: './emp-card-component.html',
  styleUrl: './emp-card-component.css'
})
export class EmpCardComponent {
 @Input()
emp:Employee={empId:0,empName:'',gender:'',address:''};
}
