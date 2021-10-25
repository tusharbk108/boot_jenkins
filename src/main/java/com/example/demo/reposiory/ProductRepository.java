package com.example.demo.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Dao.product;

public interface ProductRepository extends JpaRepository<product , Integer> {

}
