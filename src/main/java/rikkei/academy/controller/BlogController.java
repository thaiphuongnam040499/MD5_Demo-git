package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rikkei.academy.model.Blog;
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
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Blog blog){
        Blog blogCreate = blogService.save(blog);
        return ResponseEntity.ok(blogCreate);
    }
}
