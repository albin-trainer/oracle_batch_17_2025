package com.oracle.dao;

import java.util.List;

import com.oracle.entity.Product;

public interface ProductDao {
	Product addProduct(Product p);
	Product searchProductById(int id);
	Product updateProduct(Product p, int id);
	void deleteProduct(int id);
	List<Product> allProducts();
}
