package rikkei.academy.service;

import rikkei.academy.model.Blog;

import java.util.List;

import rikkei.academy.model.Blog;


public interface IBlogService {
    List<Blog> searchBlogByNameBlog(String search);
    Blog findBLogById(Long id);
    void delete(Long id);
    Blog save(Blog blog);
}
