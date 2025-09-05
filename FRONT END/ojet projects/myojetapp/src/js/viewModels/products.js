
define(['../accUtils', "knockout","require",
 "exports", "ojs/ojbootstrap", "ojs/ojarraydataprovider",
 "ojs/ojtable", "ojs/ojknockout"],
 function(accUtils,ko,require, exports, ojbootstrap_1, ArrayDataProvider) {
    function ProductsViewModel() {
      self=this;
        this.msg=ko.observable("Have a Good Day !!!")
        this.products=ko.observableArray([]);
        this.dataprovider=ko.observable();
        getAllProducts().
        then(res=>res.json()
        .then(res=> { 
          self.products(res);
          self.dataprovider(new ArrayDataProvider(self.products(), {
            keyAttributes: 'productId',
            implicitSort: [{ attribute: 'productId', direction: 'ascending' }]
        }));
          console.log(this.products())})
        );
    }
     return ProductsViewModel;
  }
);
