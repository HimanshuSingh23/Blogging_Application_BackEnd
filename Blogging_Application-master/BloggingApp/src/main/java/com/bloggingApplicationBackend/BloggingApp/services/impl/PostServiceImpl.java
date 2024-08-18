package com.bloggingApplicationBackend.BloggingApp.services.impl;

import com.bloggingApplicationBackend.BloggingApp.entities.Post;
import com.bloggingApplicationBackend.BloggingApp.payloads.PostDto;
import com.bloggingApplicationBackend.BloggingApp.services.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {


    @Override
    public Post createPost(PostDto postDto) {
        return null;
    }

    @Override
    public Post updatePost(PostDto postDto, Integer postId) {
        return null;
    }

    @Override
    public void deletePost(Integer postId) {

    }

    @Override
    public List<Post> getAllPost() {
        return List.of();
    }

    @Override
    public Post getPostById(Integer postId) {
        return null;
    }

    @Override
    public List<Post> getPostsByCategory(Integer categoryId) {
        return List.of();
    }

    @Override
    public List<Post> getPostsByUser(Integer userId) {
        return List.of();
    }

    @Override
    public List<Post> searchPosts(String keyword) {
        return List.of();
    }
}
