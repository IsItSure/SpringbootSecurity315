package demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import demo.entities.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> getUsers();
}
