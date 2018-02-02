package ru.gothmog.project.javafxdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gothmog.project.javafxdb.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
