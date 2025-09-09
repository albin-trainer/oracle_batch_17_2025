import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from './Employee';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  
  constructor(private httpClient:HttpClient){

  }
  baseUrl:string="https://68be9b179c70953d96ecdfa1.mockapi.io/employees";
  getAllEmployees():Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(this.baseUrl);
  }
}
