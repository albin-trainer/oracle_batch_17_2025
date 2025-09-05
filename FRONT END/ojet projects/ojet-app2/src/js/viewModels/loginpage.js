/**
 * @license
 * Copyright (c) 2014, 2025, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
/*
 * Your incidents ViewModel code goes here
 */
define(["require", "exports", "knockout","appController", "ojs/ojbootstrap",  "ojs/ojknockout","ojs/ojbutton",  "ojs/ojformlayout", "ojs/ojinputtext"],
 function(require, exports, ko,app) {
    function LoginViewModel() {
     self=this;
     self.username=ko.observable("");
     self.pwd=ko.observable("");
     login= ()=>{
         console.log(self.username());
         console.log(self.pwd());
         if(self.username()=="Albin"  || self.username()=="Admin" && self.pwd()=="1234") {
       //  app.goToPage("dashboard");
       localStorage.setItem("isConnected",true);
      //  app.isConnected(true);
         app.isConnected(true);
         app.userLogin(self.username());
         if( self.username()=="Admin"){
          app.setAdminMenu();
          app.goToPage("products");
         }
         else{
          app.goToPage("dashboard");
         }
         }
         else
         alert("invalid credentials")
     }
    }

    return LoginViewModel;
  }
);
