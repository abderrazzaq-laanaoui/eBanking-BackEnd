package com.laanaoui.jee.digital.banking.security.repositories;

import com.laanaoui.jee.digital.banking.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findAppRoleByRoleName(String username);
}
