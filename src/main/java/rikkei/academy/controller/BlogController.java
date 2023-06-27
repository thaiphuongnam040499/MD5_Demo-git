package rikkei.academy.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rikkei.academy.model.Blog;
import rikkei.academy.service.IBlogService;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @PostMapping("updateBlog")
    public ResponseEntity<?> updateBlog(@RequestBody Blog blog) {
        Blog blog2 = Blog
                .builder()
                .id(blog.getId())
                .nameBlog(blog.getNameBlog())
                .text(blog.getText())
                .build();
        blogService.save(blog2);
        return ResponseEntity.ok(blog2);
    }
}
