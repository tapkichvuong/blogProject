package com.minhhuy.blogProject.controller.dto;

import com.minhhuy.blogProject.vo.Post;
import lombok.Getter;

@Getter
public class PostResponseDto {
    Integer id;
    String title;
    String content;
    String username;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.username = post.getUsername();
    }
}
