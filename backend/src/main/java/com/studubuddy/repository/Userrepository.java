package com.studubuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studubuddy.Entities.User;

public interface Userrepository extends JpaRepository<User,Long>{

}
