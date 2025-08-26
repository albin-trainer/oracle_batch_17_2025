package com.oracle.dao;
import java.util.List;

import org.springframework.stereotype.Component;

import com.oracle.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Component
public class ProductDaoImpl implements ProductDao {
	@PersistenceContext
	private EntityManager em;
	@Override
	public Product addProduct(Product p) {
		em.persist(p);
		return p;
	}
	@Override
	public Product searchProductById(int id) {
		return null;
	}
	@Override
	public Product updateProduct(Product p, int id) {
		return null;
	}
	@Override
	public void deleteProduct(int id) {
		
	}
	@Override
	public List<Product> allProducts() {
		return null;
	}

}
