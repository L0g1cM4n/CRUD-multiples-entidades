package com.sena.database_connection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.database_connection.entities.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}