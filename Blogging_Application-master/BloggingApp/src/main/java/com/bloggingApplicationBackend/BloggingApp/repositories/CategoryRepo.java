package com.bloggingApplicationBackend.BloggingApp.repositories;


import com.bloggingApplicationBackend.BloggingApp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {



}
