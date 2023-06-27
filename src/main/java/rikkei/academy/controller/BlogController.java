package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rikkei.academy.model.Blog;
import rikkei.academy.service.BlogServiceIMPL;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogServiceIMPL blogServiceIMPL;
    @PutMapping("update/{id}")
    ResponseEntity<?>setStatusBlog(@PathVariable Long id){
        Blog blog=blogServiceIMPL.findBLogById(id);
        return new  ResponseEntity<>(blog, HttpStatus.OK);
    }
}
