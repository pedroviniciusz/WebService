package com.project.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
