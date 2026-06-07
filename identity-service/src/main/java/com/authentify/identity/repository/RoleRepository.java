package com.authentify.identity.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.authentify.identity.constant.ERole;
import com.authentify.identity.entity.RoleEntity;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByName(ERole name);
}
