package com.nat.blog.controllers;

import com.nat.blog.dto.ArticleDTO;
import com.nat.blog.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
@CrossOrigin(origins = "*")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    /**
     * Méthode pour afficher la liste des articles
     * @return la liste de tous les articles
     */
    @GetMapping
    public List<ArticleDTO> getAllArticles(){
        return articleService.getAllArticles();
    }

    /**
     * Retourne un article grâce à son id
     * @param id prend un id en paramètre
     * @return un article
     */
    @GetMapping(value = "/{id}")
    public ArticleDTO getArticleById(@PathVariable("id") Long id){
        return articleService.getArticleById(id);
    }

    /**
     * Méthode pour créer un article
     * @param articleDTO
     * @return l'article créer et l'affiche
     */
    @PostMapping
    public ArticleDTO createArticle(@RequestBody ArticleDTO articleDTO){
        return articleService.saveArticle(articleDTO);
    }

    /**
     * Méthode pour modifier un article
     * @param articleDTO
     * @return l'article et l'affiche
     */
    @PutMapping
    public ArticleDTO updateArticle(@RequestBody ArticleDTO articleDTO){
        return articleService.updateArticle(articleDTO);
    }

    /**
     * Méthode pour supprimer un article
     * @param id
     */
    @DeleteMapping(value = "/id")
    public void deleteArticleById(@PathVariable("id") Long id){
        articleService.deleteArticleById(id);
    }
}
