package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rikkei.academy.model.Blog;
import rikkei.academy.repository.IBlogRepository;
import rikkei.academy.service.BlogServiceIMPL;
import rikkei.academy.service.IBlogService;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping("/search/{search}")
    public ResponseEntity<?> search (@PathVariable String search) {
        List<Blog> searchList = blogService.searchBlogByNameBlog(search);
        if (searchList.isEmpty()) {
            return new ResponseEntity<>("Blog not found", HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(searchList);
    }
    @Autowired
    private BlogServiceIMPL blogServiceIMPL;

    public void delete(Long id) {
        blogServiceIMPL.delete(id);
    }
}
