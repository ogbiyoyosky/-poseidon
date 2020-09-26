package com.nueljoe.polling.seed;

import com.nueljoe.polling.model.Role;
import com.nueljoe.polling.model.RoleName;
import com.nueljoe.polling.repository.RoleRepository;
import com.nueljoe.polling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Component
public class RoleSeeder implements CommandLineRunner {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        loadRoleData();
    }

    private void loadRoleData() {
        if (roleRepository.count() == 0) {
            Role role1 = new Role(RoleName.ROLE_ADMIN);
            Role role2 = new Role(RoleName.ROLE_USER);

            roleRepository.save(role1);
            roleRepository.save(role2);
        }
        System.out.println(roleRepository.count());
    }

}
