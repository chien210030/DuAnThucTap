package com.Java.application.service;

import com.Java.application.entity.Comment;
import com.Java.application.model.request.CreateCommentPostRequest;
import com.Java.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
