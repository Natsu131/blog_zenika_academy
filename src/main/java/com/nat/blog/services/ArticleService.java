package com.nat.blog.services;

import com.nat.blog.dto.ArticleDTO;
import com.nat.blog.entities.Article;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Interface implémentant le CRUD basique pour les articles
 */

public interface ArticleService {

    /**
     * Récupère tous les articles
     *
     * @return une liste des articles
     */
    List<ArticleDTO> getAllArticles();

    /**
     * Crée un article
     *
     * @param articleDTO article à sauvegarder
     * @return l'article sauvegardé
     */
    ArticleDTO saveArticle(ArticleDTO articleDTO);

    /**
     * Recupère un article par son id
     *
     * @param id id de l'article à recupérer
     * @return l'article
     */
    ArticleDTO getArticleById(Long id);

    /**
     * Modifie un article
     *
     * @param articleDTO article à modifier
     * @return l'article modifié
     */
    ArticleDTO updateArticle(ArticleDTO articleDTO);


    void deleteArticle(Article article);
    void deleteArticleById(Long id);


    ArticleDTO convertEntityToDTO(Article article);
    Article convertDtoToEntity(ArticleDTO articleDTO);
}
