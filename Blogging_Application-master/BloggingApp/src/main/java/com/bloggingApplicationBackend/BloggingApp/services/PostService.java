package com.bloggingApplicationBackend.BloggingApp.services;

import com.bloggingApplicationBackend.BloggingApp.entities.Post;
import com.bloggingApplicationBackend.BloggingApp.payloads.PostDto;
import com.bloggingApplicationBackend.BloggingApp.payloads.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

    PostDto updatePost(PostDto postDto, Integer postId);

    void deletePost(Integer postId);

    PostResponse getAllPost(Integer pageNumber, Integer pageSize);

    PostDto getPostById(Integer postId);

    List<PostDto> getPostsByCategory(Integer categoryId);

    List<PostDto> getPostsByUser(Integer userId);

    List<Post> searchPosts(String keyword);

}
