package com.sena.database_connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.database_connection.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}