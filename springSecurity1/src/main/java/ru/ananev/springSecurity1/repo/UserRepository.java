package ru.ananev.springSecurity1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ananev.springSecurity1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
