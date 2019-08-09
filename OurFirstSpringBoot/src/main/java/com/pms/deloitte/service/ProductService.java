package com.pms.deloitte.service;

import java.util.List;

import com.pms.deloitte.model.Product;

public interface ProductService {

		public void addProduct(Product product);
		public void updateProduct(Product product);
		public List<Product> getAllProducts();
		public Product getProductById(int productId);
		public void deleteProduct(int productId);
		public Product searchById(int productId);
		public List<Product> searchBetween(int minimum,int maximum);
		public List<Product> searchProductName(String productName);
		public List<Product> searchPrice(int price);
		
}
