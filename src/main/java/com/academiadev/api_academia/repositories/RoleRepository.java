package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<UUID, Role> {
}
