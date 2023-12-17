package com.minhhuy.blogProject.vo;

import java.util.Date;

public class Post {
    Integer id;
    String title;
    String content;
    String username;
    Date createdAt;

    public Post(Integer id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public Post(Integer id, String title, String content, String username, Date createAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createdAt = createAt;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
