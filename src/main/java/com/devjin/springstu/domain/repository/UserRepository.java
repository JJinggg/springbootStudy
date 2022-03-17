package com.devjin.springstu.domain.repository;

import  com.devjin.springstu.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>
{

}
