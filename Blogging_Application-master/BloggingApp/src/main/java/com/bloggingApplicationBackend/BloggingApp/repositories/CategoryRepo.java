package com.bloggingApplicationBackend.BloggingApp.repositories;


import com.bloggingApplicationBackend.BloggingApp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {



}
