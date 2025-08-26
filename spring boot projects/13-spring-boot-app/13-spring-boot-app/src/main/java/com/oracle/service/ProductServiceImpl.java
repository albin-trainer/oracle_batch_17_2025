package com.oracle.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.oracle.dao.ProductDao;
import com.oracle.entity.Product;

import jakarta.transaction.Transactional;
@Component
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	
	@Transactional
	public Product addProductService(Product p) { //starts the transactin
		return productDao.addProduct(p);
	} //commits the transaction
	@Override
	public Product searchProductServiceById(int id) {
		return null;
	}
	@Override
	public Product updateProductService(Product p, int id) {
		return null;
	}
	@Override
	public void deleteProduct(int id) {
	}
	@Override
	public List<Product> allProductsService() {
		return null;
	}
}
