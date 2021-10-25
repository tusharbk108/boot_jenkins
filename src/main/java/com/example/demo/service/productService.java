package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.product;
import com.example.demo.reposiory.ProductRepository;

@Service
public class productService {

	@Autowired
	private ProductRepository repository;

	public product saveProduct(product product1) {
		return repository.save(product1);
	}
	

	public List<product> getProducts() {
		return repository.findAll();
	}
}
