package com.minhhuy.blogProject.mapper;

import com.minhhuy.blogProject.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();
    List<Post> findByPage(@Param("limit") Integer limit, @Param("offset") Integer offset);
    Post findOne(@Param("id") Integer id);
    Integer save(@Param("post") Post post);
    Integer update(@Param("post") Post post);

}
