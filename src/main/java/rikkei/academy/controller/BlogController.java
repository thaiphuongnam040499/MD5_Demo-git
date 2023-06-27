package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rikkei.academy.model.Blog;
import rikkei.academy.repository.IBlogRepository;
import rikkei.academy.service.BlogServiceIMPL;
import rikkei.academy.service.IBlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    private BlogServiceIMPL blogServiceIMPL;
    @PutMapping("update/{id}")
    ResponseEntity<?>setStatusBlog(@PathVariable Long id){
        Blog blog=blogServiceIMPL.findBLogById(id);
        return new  ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping("/search/{search}")
    public ResponseEntity<?> search (@PathVariable String search) {
        List<Blog> searchList = blogService.searchBlogByNameBlog(search);
        if (searchList.isEmpty()) {
            return new ResponseEntity<>("Blog not found", HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(searchList);
    }

    public void delete(Long id) {
        blogService.delete(id);
    }

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
