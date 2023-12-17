package com.minhhuy.blogProject.controller;

import com.minhhuy.blogProject.controller.dto.PostRequestDto;
import com.minhhuy.blogProject.controller.dto.PostResponseDto;
import com.minhhuy.blogProject.service.PostService;
import com.minhhuy.blogProject.vo.Post;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/post")
    public List<PostResponseDto> getPostList(@RequestParam Integer page){
        List<Post> postList = postService.getPostByPage(page, 3);
        List<PostResponseDto> postResponseDtoList = new ArrayList<>();
        for(Post post:postList){
            postResponseDtoList.add(new PostResponseDto(post));
        }
        return postResponseDtoList;
    }

    @PostMapping("/post")
    public String createPost(@RequestBody PostRequestDto postRequestDto){
        Post post = postRequestDto.getPost();
        postService.savePost(post);
        return "Success";
    }

    @PutMapping("/post")
    public String updatePost(@RequestBody PostRequestDto postRequestDto){
        Post post = postRequestDto.getPost();
        postService.updatePost(post);
        return "Success";
    }
}
