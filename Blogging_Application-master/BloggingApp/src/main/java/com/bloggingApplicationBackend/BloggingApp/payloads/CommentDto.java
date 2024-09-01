package com.bloggingApplicationBackend.BloggingApp.payloads;

import com.bloggingApplicationBackend.BloggingApp.entities.Post;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {




    private int id;

    private String content;


}
