package com.dadazao.api;

import com.dadazao.entity.Blog;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BlogServiceFallback implements BlogService {

    @Override
    public List<Blog> list() {
        return new ArrayList<>();
    }

    @Override
    public Blog get(Long id) {
        return null;
    }
}
