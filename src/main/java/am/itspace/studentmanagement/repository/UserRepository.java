package am.itspace.studentmanagement.repository;

import am.itspace.studentmanagement.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}