package rikkei.academy.service;

import rikkei.academy.model.Blog;

import java.sql.Blob;

public interface IBlogService{
    Blog save(Blog blog);
}
