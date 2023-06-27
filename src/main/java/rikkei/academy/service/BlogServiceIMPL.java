package rikkei.academy.service;

import org.springframework.stereotype.Service;
import rikkei.academy.model.Blog;
import rikkei.academy.repository.IBlogRepository;
@Service
public class BlogServiceIMPL implements IBlogService{
    private IBlogRepository iBlogRepository;
    @Override
    public Blog findBLogById(Long id) {
        Blog blog=iBlogRepository.findBlogById(id);
        blog.setStatus(!blog.isStatus());
        return blog;
    }
}
