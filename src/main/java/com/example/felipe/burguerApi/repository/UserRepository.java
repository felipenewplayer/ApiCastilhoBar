package com.example.felipe.burguerApi.repository;

import com.example.felipe.burguerApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
