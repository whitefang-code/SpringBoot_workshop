package com.arn.luc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arn.luc.course.entities.OrderItem;

public interface  OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
