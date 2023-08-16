package com.nat.blog.services;

import com.nat.blog.dto.ArticleDTO;
import com.nat.blog.entities.Article;
import com.nat.blog.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ArticleServiceImpl implements ArticleService
{

    @Autowired
    ArticleRepository articleRepository;


    @Override
    public List<ArticleDTO> getAllArticles() {

        return articleRepository.findAll().stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }
    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return convertEntityToDTO(articleRepository.save(convertDtoToEntity(articleDTO)));
    }

    @Override
    public ArticleDTO getArticleById(Long id) {
        return convertEntityToDTO(articleRepository.findById(id).get());
    }

    @Override
    public ArticleDTO updateArticle(ArticleDTO articleDTO) {
        return convertEntityToDTO(articleRepository.save(convertDtoToEntity(articleDTO)));
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
        articleDTO.setAuthorId((article.getAuthorId()));
        return articleDTO;
    }

    @Override
    public Article convertDtoToEntity(ArticleDTO articleDTO) {

        Article article = new Article();
        article.setId(articleDTO.getId());
        article.setTitle(articleDTO.getTitle());
        article.setContent(articleDTO.getContent());
        article.setSummary((articleDTO.getSummary()));
        article.setAuthorId((articleDTO.getAuthorId()));
        return article;
    }
}
