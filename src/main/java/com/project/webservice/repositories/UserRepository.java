package com.project.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
