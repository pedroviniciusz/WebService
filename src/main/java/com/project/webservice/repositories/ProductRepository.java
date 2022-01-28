package com.project.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.webservice.entities.Category;
import com.project.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
