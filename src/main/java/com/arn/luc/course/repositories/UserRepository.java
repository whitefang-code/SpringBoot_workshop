package com.arn.luc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arn.luc.course.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

}
