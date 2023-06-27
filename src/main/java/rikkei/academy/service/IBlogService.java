package rikkei.academy.service;

import rikkei.academy.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> searchBlogByNameBlog(String search);
    void delete(Long id);
}
