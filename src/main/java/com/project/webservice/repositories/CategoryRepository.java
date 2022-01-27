package com.project.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
