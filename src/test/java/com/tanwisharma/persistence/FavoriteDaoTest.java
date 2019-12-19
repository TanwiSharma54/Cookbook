package com.tanwisharma.persistence;

import com.tanwisharma.entity.Favorite;
import com.tanwisharma.entity.User;
import com.tanwisharma.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FavoriteDaoTest {
    FavoriteDao dao;
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        dao = new FavoriteDao();
    }
    /**
     * Verify successful all favorite count
     */
    @Test
    void getAllFavoriteTest() {
        List<Favorite> favorite = dao.getAllFavorite();
        assertEquals(10, favorite.size());
    }
    /**
     * Verify successful favorite by id
     */
    @Test
    void getById() {
        Favorite favorite = dao.getById(23);
        assertNotNull(favorite);
        assertEquals("Frozen Chocolate Banana", favorite.getTitle());
    }
    /**
     * Verify successful favorite update
     */
    @Test
    void saveOrUpdate() {
        String newTitle = "Frozen Chocolate";
        Favorite favoriteToUpdate = dao.getById(23);
        favoriteToUpdate.setTitle(newTitle);
        dao.saveOrUpdate(favoriteToUpdate);
        Favorite retrievedfavorite = dao.getById(23);
        assertEquals(newTitle, retrievedfavorite.getTitle());
    }

    /**
     * Verify successful insertion of users favorite
     */
    @Test
    void insert() {
        User user = new User(2,"Tanya","Bing","tanyasharma","tanya@gmail.com","userpassword");
        Favorite newFavorite = new Favorite("12345","Red Sauce Pasta",user);
        int id = dao.insert(newFavorite);
        Favorite insertedFav = dao.getById(id);
        assertNotNull(insertedFav);
        assertEquals("Red Sauce Pasta", insertedFav.getTitle());
    }

    /**
     * Verify successful delete of user's favorite
     */
    @Test
    void delete() {
        dao.delete(dao.getById(29));
        assertNull(dao.getById(29));
    }
}