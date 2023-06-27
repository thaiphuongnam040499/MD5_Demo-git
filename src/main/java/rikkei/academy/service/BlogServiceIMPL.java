package rikkei.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.academy.model.Blog;
import rikkei.academy.repository.IBlogRepository;

@Service

public class BlogServiceIMPL implements IBlogService<Blog,Long> {
    @Autowired
    private IBlogRepository iBlogRepository;
    @Override
    public void delete(Long id) {
iBlogRepository.deleteById(id);
    }
}
