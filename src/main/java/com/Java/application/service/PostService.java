package com.Java.application.service;

import com.Java.application.entity.Post;
import com.Java.application.entity.User;
import com.Java.application.model.dto.PageableDTO;
import com.Java.application.model.request.CreatePostRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    PageableDTO adminGetListPost(String title, String status, int page);

    Post createPost(CreatePostRequest createPostRequest, User user);

    void updatePost(CreatePostRequest createPostRequest, User user, Long id);

    void deletePost(long id);

    Post getPostById(long id);

    Page<Post> adminGetListPosts(String title, String status, Integer page);

    List<Post> getLatesPost();

    Page<Post> getListPost(int page);

    List<Post> getLatestPostsNotId(long id);

    long getCountPost();
}
