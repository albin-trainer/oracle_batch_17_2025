
define(['../accUtils', "knockout","require",
 "exports", "ojs/ojbootstrap", "ojs/ojarraydataprovider",
 "ojs/ojtable", "ojs/ojknockout","ojs/ojbutton","ojs/ojdialog","ojs/ojformlayout", "ojs/ojinputtext", "ojs/ojmessages"],
 function(accUtils,ko,require, exports, ojbootstrap_1, ArrayDataProvider) {
    function ProductsViewModel() {
      self=this;
        this.msg=ko.observable("Have a Good Day !!!")
        this.products=ko.observableArray([]);
        this.prodId=ko.observable();
        this.prodName=ko.observable("");
        this.price=ko.observable();
        this.messagesDataprovider =ko.observableArray([]);


        this.selectedProdId=ko.observable();
        this.selectedProdName=ko.observable();
        this.selectedPrice=ko.observable();



        this.dataprovider = new ArrayDataProvider(this.products, {
          keyAttributes: 'productId',
          implicitSort: [{ attribute: 'productId', direction: 'ascending' }]
      });
      getAllProducts().then(res=>this.products(res));
      
     this.openAddProductDialag=()=>{
       document.getElementById("modalDialog1").open();
     }

     this.saveProduct=()=>{

      addNewProduct({productId:this.prodId(),productName:this.prodName(),price:this.price()}).then(
        res=>{ document.getElementById("modalDialog1").close();
        this.messagesDataprovider.push({
          severity: 'confirmation',
          summary: 'Confirmation message summary no detail',
          autoTimeout: 5000
      
       })}
      )
     };
     this.closeNewProdDialog=()=>{
      document.getElementById("modalDialog1").close();
      this.messagesDataprovider.push({
        severity: 'confirmation',
        summary: 'u hv cancelled',
        autoTimeout: 5000
    
     })
     }
     this. selectedChangedListener= event =>{
       console.log("Selected  a row *****");
           const row=event.detail.value.row;
         //  alert(row);
         row.values().forEach((key)=>{
            console.log("Key : "+key)
             var selectedRow=self.products().find(s=>s.productId==key);
             console.log("selected row : "+selectedRow.productName);
             self.selectedProdId(selectedRow.productId);
             self.selectedProdName(selectedRow.productName);
             self.selectedPrice(selectedRow.price);
         });
     }

     
this.saveUpdate =function() {
}
this.openUpdateDialog=function(){
  document.getElementById("updateProductDialog").open();
}
this.closeUpdateDialog=function(){
  document.getElementById("updateProductDialog").close();
}

this. openDelete=function() {
  document.getElementById("deleteProductDialog").open();
}
this.cancelDelete =function() {
document.getElementById("deleteProductDialog").close();
}
    }
     return ProductsViewModel;
  }
);
