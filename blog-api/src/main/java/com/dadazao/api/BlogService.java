package com.dadazao.api;

import com.dadazao.entity.Blog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author John Li
 */
@Api(description = "博客操作接口")
@FeignClient(value = "blog-service", fallback = BlogServiceFallback.class)
public interface BlogService {

    @GetMapping("/list")
    @ApiOperation("获得所有博客")
    List<Blog> list();

    @GetMapping("/get/{id}")
    @ApiOperation("根据id获得博客内容")
    Blog get(@PathVariable("id") Long id);
}
