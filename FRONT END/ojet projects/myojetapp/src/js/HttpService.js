
function getAllProducts(){
    return new Promise( 
        function (resolved, rejected) {   
       fetch("http://localhost:8080/products").
      then(res=>res.json()).then(data=> resolved(data)).
      catch(err=>rejected(err))
 })
 }
 
 function addNewProduct(product){
     return new Promise(
         (resolve,reject)=>{
             var headers={};
             headers['Accept']='application/json';   
             headers['Content-Type']='application/json';   
      
             //fetch returns promise
             fetch("http://localhost:8080/products",{
                 method:'POST',
                 headers:headers,
                 body:JSON.stringify(product)
               //  mode:'cors'
            //  ,body:jsondata
             }
             ).then(data=>resolve(data)).catch(error=>reject(error))
         }
     );
 }