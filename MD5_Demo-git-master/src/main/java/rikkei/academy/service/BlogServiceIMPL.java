package rikkei.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.academy.model.Blog;
import rikkei.academy.repository.IBlogRepository;

@Service
public class BlogServiceIMPL implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }


}
