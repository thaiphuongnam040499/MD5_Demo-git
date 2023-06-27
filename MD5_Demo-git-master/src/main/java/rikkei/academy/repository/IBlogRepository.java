package rikkei.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rikkei.academy.model.Blog;

@Repository
public interface IBlogRepository  extends JpaRepository<Blog, Long >
         {
}
