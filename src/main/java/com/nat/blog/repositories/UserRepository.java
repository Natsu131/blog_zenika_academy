package com.nat.blog.repositories;

import com.nat.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    /**
     * Liste des utilisateurs
     * @param name
     * @return les utilisateurs par nom
     */
    List<User> findbyUseName(String name);
}
