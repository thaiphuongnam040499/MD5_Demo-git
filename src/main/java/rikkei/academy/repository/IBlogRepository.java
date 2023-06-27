package rikkei.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkei.academy.model.Blog;

public interface IBlogRepository extends JpaRepository<Blog,Long> {
}
