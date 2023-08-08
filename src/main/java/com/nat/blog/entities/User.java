package com.nat.blog.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

/**
 * Classe qui représente un utilisateur
 */
@Entity
public class User {

    /**
     * Identifiant d'un utilisateur
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nom d'un utilisateur
     */
    private String name;

    /**
     * Mail d'un utilisateur
     */
    private String mail;

    /**
     * Relation OneToMany entre utilisateurs et articles
     */
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Article>articles;

    /**
     * Constructeur vide requis par Spring
     */
    public User() {
    }

    /**
     * Constructeur avec paramètres
     * @param name  Nom d'un utilisateur
     * @param mail Mail d'un utilisateur
     */
    public User(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", articles=" + articles +
                '}';
    }
}
