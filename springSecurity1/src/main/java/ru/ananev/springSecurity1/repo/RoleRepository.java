package ru.ananev.springSecurity1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ananev.springSecurity1.entities.Role;

public interface RoleRepository extends JpaRepository <Role, Long>{
}
