package com.example.demojwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demojwt.constant.ERole;
import com.example.demojwt.entity.RoleEntity;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByName(ERole name);
}
