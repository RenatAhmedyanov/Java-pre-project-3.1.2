package dbWebApplication.dao;

import dbWebApplication.models.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    User findUserById(Integer id);
    List<User> findAllUsers();
    void updateUser(User updatedUser);
    void deleteUser(int id);
}
