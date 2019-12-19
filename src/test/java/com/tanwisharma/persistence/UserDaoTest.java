package com.tanwisharma.persistence;

import com.tanwisharma.entity.User;
import com.tanwisharma.testUtils.Database;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
    UserDao dao;
    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        dao = new UserDao();
    }
    @Test
    void getByIdTest() {
        User user = dao.getById(1);
        assertNotNull(user);
        assertEquals("Tanwi", user.getFirst_name());
    }

    @Test
    void getByUsernameTest() {
        User user = dao.getByUsername("tsharma");
        assertEquals("Tanwi", user.getFirst_name());
    }
    @Test
    void saveOrUpdate() {
        String newLastName = "Bing";
        User userToUpdate = dao.getById(6);
        userToUpdate.setLast_name(newLastName);
        dao.saveOrUpdate(userToUpdate);
        User retrievedUser = dao.getById(6);
        assertEquals(newLastName, retrievedUser.getLast_name());
    }

    @Test
    void insert() {
        User newAuthor = new User("Chandler", "Bing","chandlerbing","cbing@mail","userrp");
        int id = dao.insert(newAuthor);
        User insertedAuthor = dao.getById(id);
        assertNotNull(insertedAuthor);
        assertEquals("Chandler", insertedAuthor.getFirst_name());
    }

    @Test
    void delete() {
        dao.delete(dao.getById(6));
        assertNull(dao.getById(7));
    }
}