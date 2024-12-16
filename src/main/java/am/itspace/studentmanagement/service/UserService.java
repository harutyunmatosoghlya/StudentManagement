package am.itspace.studentmanagement.service;

import am.itspace.studentmanagement.entitiy.User;
import am.itspace.studentmanagement.entitiy.UserType;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User user);
}