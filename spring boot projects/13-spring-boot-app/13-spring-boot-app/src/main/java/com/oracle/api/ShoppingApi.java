package com.oracle.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.entity.Product;
import com.oracle.service.ProductService;

@RestController
@RequestMapping("/products")
public class ShoppingApi {
	@Autowired
	private ProductService prodService;
	@GetMapping("test")
	public String test() {
		return "Test";
	}
	@PostMapping
	public Product addNewProduct(@RequestBody  Product p) {
		return prodService.addProductService(p);
	}
	@GetMapping("/{id}")
	public Product searchById(@PathVariable("id")  int id) {
		return null;
	}
	@PutMapping("/{id}")
	public Product updateProduct(@RequestBody Product p,int id) {
		return null;
	}
	public void delProduct(int id) {
	}
	public List<Product> getAllProducts(){
		return null;
	}
}
