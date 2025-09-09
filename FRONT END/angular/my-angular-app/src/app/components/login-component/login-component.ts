import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-component',
  standalone: false,
  templateUrl: './login-component.html',
  styleUrl: './login-component.css'
})
export class LoginComponent {
  user = {
    email: '',
    password: ''
    };
  constructor(private router: Router) {}

  onSubmit() {
    console.log('Login Data:', this.user);
    if(this.user.email==="Albin@abc.com")
    localStorage.setItem("loggedIn","true");
    this.router.navigate(['/employees']);
  }
}
