package edu.matc.persistence;
// TODO add tests for each method on the AuthorDao
// TODO remember to test that books can be added when adding an author
// TODO test that when an author is deleted, all associated books are deleted
// TODO use @BeforeEach to reset the database before each test

//import edu.matc.entity.GoogleUserDao;
import edu.matc.entity.GoogleUser;
import edu.matc.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class GoogleUserDaoTest implements Serializable {
    GoogleUserDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new GoogleUserDao();
    }

    /**
     * Verify successful retrieval of a Author
     */
    @Test
    void getByIdSuccess() {
        GoogleUser retrievedGoogleUser = dao.getById(1);
        assertNotNull(retrievedGoogleUser);
        assertEquals("Chandler Bing", retrievedGoogleUser.getName());
    }

    /**
     * Verifies gets all authors successfully.
     */
   /* @Test
    void getAllSuccess() {
        List<Author> authorList = dao.getAll();
        assertEquals(20, authorList.size());
    }*/

    /**
     * Verify successful insert of a GoogleUser
     */


    /**
     * Verify successful insert
     */
    @Test
    void insertSuccess() {

        GoogleUser newGoogleUser = new GoogleUser("John Vallaso", "vallaso@gmail.com");
        int id = dao.insert(newGoogleUser);
        assertNotEquals(0,id);
        GoogleUser insertedGoogleUser = dao.getById(id);
        assertNotNull(insertedGoogleUser);
        assertEquals("John Vallaso", insertedGoogleUser.getName());

    }

    /**
     * Verify successful update of GoogleUser
     */
   /* @Test
    void updateSuccess() {
        String newLastName = "Bing";
        Author authorToUpdate = dao.getById(6);
        authorToUpdate.setLast_name(newLastName);
        dao.saveOrUpdate(authorToUpdate);
        Author retrievedUser = dao.getById(6);
        assertEquals(newLastName, retrievedUser.getLast_name());
    }*/

    /**
     * Verify successful delete of Author
     */
   /* @Test
    void deleteSuccess() {
        dao.delete(dao.getById(39));
        assertNull(dao.getById(39));
    }*/

}
