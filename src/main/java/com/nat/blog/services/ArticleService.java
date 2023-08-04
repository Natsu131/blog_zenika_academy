package com.nat.blog.services;

import com.nat.blog.entities.Article;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Interface implémentant le CRUD basique pour les articles
 */
@Service
public interface ArticleService {

    /**
     * Récupère tous les articles
     *
     * @return une liste des articles
     */
    List<Article> getAllArticles();

    /**
     * Crée un article
     *
     * @param article article à sauvegarder
     * @return l'article sauvegardé
     */
    Article saveArticle(Article article);

    /**
     * Recupère un article par son id
     *
     * @param id id de l'article à recupérer
     * @return l'article
     */
    Article getArticleById(Long id);

    /**
     * Modifie un article
     *
     * @param article article à modifier
     * @param id id de l'article à modifier
     * @return l'article modifié
     */
    Article updateArticle(Article article, Long id);

    /**
     * Supprimer un article
     *
     * @param id id de l'article à supprimer
     */
    void deleteArticle(Long id);
}
