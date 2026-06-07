package com.authentify.identity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentify.identity.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
	Optional<UserEntity> findByEmail(String email);
    
	Boolean existsByEmail(String email);
}
