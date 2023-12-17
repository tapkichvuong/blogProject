package com.minhhuy.blogProject.controller;


import com.minhhuy.blogProject.service.PostService;
import com.minhhuy.blogProject.vo.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    private PostService postService;

    public IndexController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Post> postList = postService.getPostByPage(1, 3);
        model.addAttribute("posts", postList);
        return "index";
    }
}
