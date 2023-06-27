package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import rikkei.academy.repository.IBlogRepository;
import rikkei.academy.service.BlogServiceIMPL;

@RestController
public class BlogController {
    @Autowired
    private BlogServiceIMPL blogServiceIMPL;

    public void delete(Long id) {
        blogServiceIMPL.delete(id);
    }
}
