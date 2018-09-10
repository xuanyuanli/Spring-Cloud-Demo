package com.dadazao.web;

import com.dadazao.api.BlogService;
import com.dadazao.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogControllerTest {
    @Autowired
    BlogService blogService;

    @Test
    public void blogList() {
        List<Blog> list = blogService.list();
        System.out.println(list.size());
        for (Blog blog : list) {
            System.out.println(blog);
        }
    }
}