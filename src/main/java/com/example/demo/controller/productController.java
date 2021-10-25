package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.product;
import com.example.demo.service.productService;

@RestController
public class productController {

	@Autowired
	private productService service;
	
	@PostMapping("/addProduct")
	public product addProduct(@RequestBody product product) {
		return service.saveProduct(product);
	}
	
	@GetMapping("/Products")
	public List<product> getProduct() {
		return service.getProducts();
	}
}
