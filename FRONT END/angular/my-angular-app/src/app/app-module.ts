import { NgModule, provideBrowserGlobalErrorListeners, provideZonelessChangeDetection } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Employees } from './components/employees/employees';
import { EmpCardComponent } from './components/emp-card-component/emp-card-component';
import {HttpClientModule} from '@angular/common/http';
import { MenuComponent } from './components/menu-component/menu-component';
import { EmpFormComponent } from './emp-form-component/emp-form-component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './components/login-component/login-component';
@NgModule({
  declarations: [
    App,
    Employees,
    EmpCardComponent,
    MenuComponent,
    EmpFormComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,FormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideZonelessChangeDetection()
  ],
  bootstrap: [App]
})
export class AppModule { }
