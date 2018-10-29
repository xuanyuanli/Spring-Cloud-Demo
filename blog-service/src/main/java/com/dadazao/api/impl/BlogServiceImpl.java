package com.dadazao.api.impl;

import com.dadazao.api.BlogService;
import com.dadazao.entity.Blog;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Li
 */
@RestController
public class BlogServiceImpl implements BlogService {

    private static final List<Blog> BLOGS = new ArrayList<>(4);

    static {
        BLOGS.add(new Blog(1L, "Java", "Java Code"));
        BLOGS.add(new Blog(2L, "GoLand", "GoLand Code"));
        BLOGS.add(new Blog(3L, "Python", "Python Code"));
        BLOGS.add(new Blog(4L, "C", "C Code"));
    }

    @Override
    @GetMapping("/list")
    public List<Blog> list() {
        return BLOGS;
    }

    @Override
    @GetMapping("/get/{id}")
    public Blog get(@PathVariable("id") @ApiParam("id") Long id) {
        return BLOGS.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}

