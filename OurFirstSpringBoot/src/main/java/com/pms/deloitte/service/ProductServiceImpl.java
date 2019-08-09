package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	@Transactional
	public void addProduct(Product product) {
		productDAO.save(product);
	}
	
	@Override
	@Transactional
	public void updateProduct(Product product) {
		productDAO.save(product);
	}
	
	@Override
	@Transactional
	public List<Product> getAllProducts(){
	return (List<Product>) productDAO.findAll();
	}
	
	/*@Override
	@Transactional
	public Product getProductById(int productId) {
		//Optional<Product> product= productDAO.findById(productId);
		if(product.isPresent())
		{
			return product.get();
		}
		else
		{
			return null;
		}
	}*/
	
	@Override
	@Transactional
	public void deleteProduct(int productId) {
		productDAO.deleteById(productId);
	}

	@Override
	public Product searchById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchBetween(int minimum, int maximum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}
}
