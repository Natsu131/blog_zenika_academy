package com.nat.blog.controllers;

import com.nat.blog.entities.Article;
import com.nat.blog.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping(value = "/{id}")
    public List<Article> getAlArticles(){
        return articleService.getAllArticles();
    }

    public Article getArticleById(@PathVariable("id") Long id){
        return articleService.getArticleById(id);
    }
}
