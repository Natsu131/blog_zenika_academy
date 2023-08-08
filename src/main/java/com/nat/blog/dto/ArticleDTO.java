package com.nat.blog.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder //Utilise le design pattern Builder pour construire des objets plus facilement
public class ArticleDTO {
    /**
     * Identifiant de l'article
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Titre de l'article
     */
    private String title;

    /**
     * Contenu de l'article
     */
    private String content;

    /**
     * Resumé de l'article (max 50 mots)
     */
    private String summary;

}
