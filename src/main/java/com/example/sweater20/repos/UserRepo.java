package com.example.sweater20.repos;

import com.example.sweater20.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User FindByUsername(String username);
}
