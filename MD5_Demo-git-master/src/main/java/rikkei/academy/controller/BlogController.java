package rikkei.academy.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rikkei.academy.model.Blog;
import rikkei.academy.service.IBlogService;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Blog blog){
        Blog blogCreate = blogService.save(blog);
        return ResponseEntity.ok(blogCreate);
    }
}
