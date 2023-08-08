package com.nat.blog.services;

import com.nat.blog.dto.ArticleDTO;
import com.nat.blog.entities.Article;
import com.nat.blog.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService
{

    @Autowired
    ArticleRepository articleRepository;


    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public Article updateArticle(Article article, Long id) {
        return articleRepository.save(article);
    }

    @Override
    public void deleteArticle(Article article) {

    }

    @Override
    public void deleteArticleById(Long id) {

    }

    /**
     * Méthode qui converti une entité en DTO
     * @param article article
     * @return articleDTO
     */
    @Override
    public ArticleDTO convertEntityToDTO(Article article) {

        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setId(article.getId());
        articleDTO.setTitle(article.getTitle());
        articleDTO.setContent(article.getContent());
        articleDTO.setSummary(article.getSummary());
        return articleDTO;
    }

    @Override
    public Article convertDtoToEntoty(ArticleDTO articleDTO) {

        Article article = new Article();
        article.setId(articleDTO.getId());
        article.setTitle(articleDTO.getTitle());
        article.setContent(articleDTO.getContent());
        article.setSummary((articleDTO.getSummary()));
        return null;
    }
}
