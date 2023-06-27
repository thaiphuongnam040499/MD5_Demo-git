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
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }
    @Override
    public Blog findBLogById(Long id) {
        Blog blog=blogRepository.findBlogById(id);
        blog.setStatus(!blog.isStatus());
        return blog;
    }
}
