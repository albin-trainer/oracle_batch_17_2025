package com.oracle.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oracle.entity.Product;
@RestController
@RequestMapping("/products")
public class ProductsApi {
	@Autowired
private Environment env;
private List<Product> plist=new ArrayList<>();
 private void loadProducts() {
	 String port=env.getProperty("local.server.port");
	 plist.add(new Product(101,"Phone",20000,port) );
	 plist.add(new Product(102,"Laptop",50000,port) );
	 plist.add(new Product(103,"Shoes",2000,port) );
	 plist.add(new Product(104,"Mouse",1000,port) );
 }
 @GetMapping("/{id}")
 public   Product getProduct(@PathVariable("id")  int id)  {
	 loadProducts();
	return plist.stream().filter(p->p.getProductId()==id).findFirst().get();
 }
}
