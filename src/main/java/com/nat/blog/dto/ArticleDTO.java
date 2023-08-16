package com.nat.blog.dto;

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

    private Long authorId;

}
