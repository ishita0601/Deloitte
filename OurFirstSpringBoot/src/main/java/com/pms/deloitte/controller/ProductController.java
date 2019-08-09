package com.pms.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController 
{
	@Autowired
	ProductService productService;
	
//	@RequestMapping("/getProduct/{pId}")
//	public Product getProduct(@PathVariable("pId")Integer productId) {
//		Product product= productService.getProductById(productId);
//		return product;
//	}
	
//	@RequestMapping("/saveProduct")
//	public String saveProduct() {
//		Product product=new Product(111,"Bottle",1000,250);
//		productService.addProduct(product);
//		return "Saving Product";
//	}
//	
//	@RequestMapping("/findProduct/")
//	public String saveProduct() {
//		Product product=new Product(111,"Bottle",1000,250);
//		productService.addProduct(product);
//		return "Saving Product";
//	}
	
	@RequestMapping("/product")
	public String getProduct(Model model) {
		model.addAttribute("product",new Product());
		return "product";
	}
}
