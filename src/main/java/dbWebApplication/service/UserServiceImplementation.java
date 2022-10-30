package dbWebApplication.service;

import dbWebApplication.dao.UserDAO;
import dbWebApplication.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public User findUserById(Integer id) {
        return userDAO.findUserById(id);
    }

    public List<User> findAllUsers() {
        return userDAO.findAllUsers();
    }

    @Transactional
    public void updateUser(User updatedUser) {
        userDAO.updateUser(updatedUser);
    }

    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
