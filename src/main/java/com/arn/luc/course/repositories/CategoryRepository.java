package com.arn.luc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arn.luc.course.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long> {

}
