package com.nat.blog.entities;

import jakarta.persistence.*;



/**
 * Classe qui représente un article
 */
@Entity
public class Article {

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


    private Long authorId;


    /**
     * Constructeur vide requis par Spring
     */
    public Article() {
        super();
    }

    /**
     * Constructeur avec paramètres
     * Todo véfirier si l'id est présent dans le constructeur
     * @param id
     * @param title
     * @param content
     * @param summary
     */
    public Article(Long id, String title, String content, String summary, Long userId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.summary = summary;
        this.authorId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    /**
     * Méthode qui permet d'afficher un article
     * @return une représentation textuelle d'un article
     */
    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", summary='" + summary + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}

