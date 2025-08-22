package com.oracle.api;
import java.util.List;
import java.util.Optional;

import com.oracle.dao.ProductDao;
import com.oracle.exception.ProductNotFoundException;
import com.oracle.model.Product;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
@Path("/products")
public class ShoppingApi {
	ProductDao dao=new ProductDao();
	@GET
	public List<Product>  getAllProducts() {
		return dao.allProducts();
	}
	@GET
	@Path("/searchbyname")  //products/searchbyname?name=Shoes
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
	public  Response   searchByName(@QueryParam("name") String name){
		List<Product> plist=dao.allProducts();
		plist=
		plist.stream().filter(p->p.getProdName().toLowerCase().startsWith(name.toLowerCase())).toList();
		if(plist.size()>=1)
			return Response.status(200).entity(plist).build();
		
		 return Response.status(204).build();
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
	public List<Product> addNewProduct(Product p){
		//add the product in the list & return it 
		List<Product> plist=dao.allProducts();
		plist.add(p);
		return plist;
	}
	///products/{pid}
	public List<Product> updateProduct(Product p, int pid){
		//update the collection & return it ....
		return null;
	}
	///products/{pid}
		public List<Product> removeProduct( int pid){
			//remove  the product from the collection &  return it ....
			return null;
		}
	@GET
	@Path("/{prodId}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
	public   Product searchById(@PathParam("prodId")  int prodId) {
		List<Product> plist=dao.allProducts();
		//use java 8 streams to filter & get the product
		//& return it 
		  Optional<Product> optional  =plist.stream().
				filter(p->p.getProductId()==prodId).
				findFirst();
		if(optional.isPresent())
			return optional.get();
		throw new ProductNotFoundException("The product "+prodId+" is not found");
	}
	
	@GET
	@Path("/sampleproduct")
	@Produces(MediaType.APPLICATION_JSON)
	public Product testProduct() {
		Product p=new Product();
		p.setProductId(101);
		p.setProdName("T Shirt");
		p.setPrice(1000);
		return p;
	}
}
