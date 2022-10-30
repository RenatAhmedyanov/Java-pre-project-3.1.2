package dbWebApplication.dao;

import dbWebApplication.models.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDAOImplementation implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public void addUser(User user) {
        entityManager.persist(user);
    }

    public User findUserById(Integer id) {
        return entityManager.find(User.class, id);
    }

    public List<User> findAllUsers() {
        TypedQuery<User> findAllQuery = entityManager.createQuery("SELECT user FROM User user", User.class);
        return findAllQuery.getResultList();
    }

    public void updateUser(User updatedUser) {
        entityManager.merge(updatedUser);
    }

    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
