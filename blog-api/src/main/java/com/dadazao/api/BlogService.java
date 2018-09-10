package com.dadazao.api;

import com.dadazao.entity.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "blog-service", fallback = BlogServiceFallback.class)
public interface BlogService {

    @GetMapping("/list")
    List<Blog> list();

    @GetMapping("/get/{id}")
    Blog get(@PathVariable("id") Long id);
}
