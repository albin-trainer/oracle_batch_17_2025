import { Component, signal } from '@angular/core';
import { Employee } from './Employee';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('my-angular-app');
  msg:string="Good morning";
  nums:number[]=[10,20,30,40,50]
  emp:Employee={"empId":101,"empName":"Subha",gender:"female",address:""};

}
