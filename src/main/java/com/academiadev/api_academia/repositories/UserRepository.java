package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UUID, User> {
}
