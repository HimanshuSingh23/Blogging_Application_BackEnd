package com.bloggingApplicationBackend.BloggingApp.services;

import com.bloggingApplicationBackend.BloggingApp.entities.Post;
import com.bloggingApplicationBackend.BloggingApp.payloads.PostDto;

import java.util.List;

public interface PostService {

    Post createPost(PostDto postDto);

    Post updatePost(PostDto postDto, Integer postId);

    void deletePost(Integer postId);

    List<Post> getAllPost();

    Post getPostById(Integer postId);

    List<Post> getPostsByCategory(Integer categoryId);

    List<Post> getPostsByUser(Integer userId);

    List<Post> searchPosts(String keyword);

}
