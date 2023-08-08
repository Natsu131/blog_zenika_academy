package com.nat.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    /**
     * Identifiant d'un utilisateur
     */
    private Long id;

    /**
     * Nom d'un utilisateur
     */
    private String name;

    /**
     * Mail d'un utilisateur
     */
    private String mail;
}
