package com.arn.luc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arn.luc.course.entities.Product;

public interface  ProductRepository extends JpaRepository<Product, Long> {

}
