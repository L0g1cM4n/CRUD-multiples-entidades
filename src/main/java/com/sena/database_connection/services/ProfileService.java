package com.sena.database_connection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sena.database_connection.entities.Profile;
import com.sena.database_connection.entities.User;
import com.sena.database_connection.repositories.ProfileRepository;
import com.sena.database_connection.repositories.UserRepository;

@Service
public class ProfileService {

    private ProfileRepository repository;
    private UserRepository userRepository;

    public ProfileService(ProfileRepository repository, UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }

    public List<Profile> obtenerTodos() {
        return this.repository.findAll();
    }

    public Optional<Profile> porId(Long id) {
        return this.repository.findById(id);
    }

    public Profile crear(Profile profile) {
        return this.repository.save(profile);
    }

    public Profile actualizar(Profile profile) {
        Optional<Profile> profileFound = this.porId(profile.getId());

        if (profileFound.isEmpty()) {
            return null;
        }

        return this.repository.save(profile);
    }

    public Profile eliminar(Long id) {
        Optional<Profile> profileFound = this.porId(id);

        if (profileFound.isEmpty()) {
            return null;
        }

        this.repository.delete(profileFound.get());
        return profileFound.get();
    }

    // Método auxiliar para resolver el User desde el userId del DTO
    public Optional<User> buscarUsuario(Long userId) {
        return this.userRepository.findById(userId);
    }
}