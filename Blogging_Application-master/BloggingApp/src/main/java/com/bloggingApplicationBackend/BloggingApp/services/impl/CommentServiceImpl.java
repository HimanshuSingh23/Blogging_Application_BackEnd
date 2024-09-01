package com.bloggingApplicationBackend.BloggingApp.services.impl;


import com.bloggingApplicationBackend.BloggingApp.entities.Comment;
import com.bloggingApplicationBackend.BloggingApp.entities.Post;
import com.bloggingApplicationBackend.BloggingApp.exceptions.ResourceNotFoundException;
import com.bloggingApplicationBackend.BloggingApp.payloads.CommentDto;
import com.bloggingApplicationBackend.BloggingApp.repositories.CommentRepo;
import com.bloggingApplicationBackend.BloggingApp.repositories.PostRepo;
import com.bloggingApplicationBackend.BloggingApp.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private CommentRepo commentRepo;

    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {

        Post post = this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("post","post id",postId));

        Comment comment= this.modelMapper.map(commentDto, Comment.class);

        comment.setPost(post);

        Comment savedComment = this.commentRepo.save(comment);

        return this.modelMapper.map(savedComment,CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {

        Comment comment = this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment","comment id",commentId));
        this.commentRepo.delete(comment);

    }
}
