
function getAllProducts(){
   return new Promise( 
       function (resolved, rejected) {   
      fetch("http://localhost:8080/products").
     then(res=>resolved(res)).
     catch(err=>rejected(err))
   
})
}