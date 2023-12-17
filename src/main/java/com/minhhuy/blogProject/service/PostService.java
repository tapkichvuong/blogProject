package com.minhhuy.blogProject.service;

import com.minhhuy.blogProject.mapper.PostMapper;
import com.minhhuy.blogProject.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostMapper postMapper;

    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }
    public List<Post> getAllPost(){
        List<Post> postList = postMapper.findAll();
        postList.forEach(elm -> {
            System.out.println(elm.getId());
        });
        return postMapper.findAll();
    }

    public List<Post> getPostByPage(Integer page, Integer size){
        return postMapper.findByPage(size, (page - 1) * size);
    }

    public Post getPostById(Integer id){
        return postMapper.findOne(id);
    }

    public boolean savePost(Post post){
        Integer result = postMapper.save(post);
        return result == 1;
    }

    public boolean updatePost(Post post){
        Integer result = postMapper.update(post);
        return result == 1;
    }
}
