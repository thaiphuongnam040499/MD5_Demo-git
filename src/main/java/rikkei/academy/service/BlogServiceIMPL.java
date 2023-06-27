package rikkei.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.academy.model.Blog;
import rikkei.academy.repository.IBlogRepository;

import java.util.List;

@Service
public class BlogServiceIMPL implements IBlogService {
    @Autowired
    IBlogRepository blogRepository;
    @Override
    public List<Blog> searchBlogByNameBlog(String search) {
        return blogRepository.searchBlogByNameBlog(search);
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }
}
