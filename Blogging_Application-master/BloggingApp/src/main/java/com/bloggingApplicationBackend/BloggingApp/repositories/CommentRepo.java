package com.bloggingApplicationBackend.BloggingApp.repositories;

import com.bloggingApplicationBackend.BloggingApp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment ,Integer>{


}
