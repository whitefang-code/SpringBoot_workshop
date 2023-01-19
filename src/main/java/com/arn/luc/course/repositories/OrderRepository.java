package com.arn.luc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arn.luc.course.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {

}
