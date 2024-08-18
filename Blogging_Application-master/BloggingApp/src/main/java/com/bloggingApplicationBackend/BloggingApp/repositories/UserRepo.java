package com.bloggingApplicationBackend.BloggingApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloggingApplicationBackend.BloggingApp.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

}
