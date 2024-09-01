package com.bloggingApplicationBackend.BloggingApp.controller;


import com.bloggingApplicationBackend.BloggingApp.entities.Comment;
import com.bloggingApplicationBackend.BloggingApp.payloads.ApiResponse;
import com.bloggingApplicationBackend.BloggingApp.payloads.CommentDto;
import com.bloggingApplicationBackend.BloggingApp.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {


    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment, @PathVariable Integer postId)
    {

        CommentDto createdComment = this.commentService.createComment(comment,postId);
        return new ResponseEntity<CommentDto>(createdComment, HttpStatus.CREATED);

    }


    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId)
    {

        this.commentService.deleteComment(commentId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("comment deleted successfullly",true),HttpStatus.OK);

    }


}
