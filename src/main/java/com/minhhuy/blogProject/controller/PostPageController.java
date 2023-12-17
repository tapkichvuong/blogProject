package com.minhhuy.blogProject.controller;

import com.minhhuy.blogProject.service.PostService;
import com.minhhuy.blogProject.vo.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostPageController {
    private PostService postService;

    public PostPageController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/post/{id}")
    public String getPostDetailPage(Model model, @PathVariable Integer id){
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        return "post_detail";
    }

    @RequestMapping("/post/create")
    public String getPostCreatePage(){
        return "post_write";
    }

    @RequestMapping("/post/edit/{id}")
    public String editPostDetailPage(Model model, @PathVariable Integer id){
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        return "post_edit";
    }
}
