package com.authentify.identity;

import com.authentify.identity.constant.ERole;
import com.authentify.identity.entity.RoleEntity;
import com.authentify.identity.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StartUp implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        Optional<RoleEntity> optRoleAdmin = roleRepository.findByName(ERole.ROLE_ADMIN);
        if(optRoleAdmin.isEmpty()){
            RoleEntity role = new RoleEntity();
            role.setName(ERole.ROLE_ADMIN);
            roleRepository.save(role);
        }

        Optional<RoleEntity> optRoleOwn = roleRepository.findByName(ERole.ROLE_MODERATOR);
        if(optRoleOwn.isEmpty()){
            RoleEntity role = new RoleEntity();
            role.setName(ERole.ROLE_MODERATOR);
            roleRepository.save(role);
        }

        Optional<RoleEntity> optRoleMe = roleRepository.findByName(ERole.ROLE_USER);
        if(optRoleMe.isEmpty()){
            RoleEntity role = new RoleEntity();
            role.setName(ERole.ROLE_USER);
            roleRepository.save(role);
        }
    }
}