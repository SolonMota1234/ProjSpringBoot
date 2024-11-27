package com.apredizagem.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apredizagem.demo.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
