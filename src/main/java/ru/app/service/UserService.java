package ru.app.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.app.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    User readUser(long id);

    User deleteUser(long parseUnsignedInt);

    void createOrUpdateUser(User user);

    void deleteTable();
}
