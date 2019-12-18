//AddToFavoriteController
package com.tanwisharma.controller;

import com.tanwisharma.entity.Favorite;
import com.tanwisharma.entity.IngredientsSearchResult;
import com.tanwisharma.entity.ResultsItem;
import com.tanwisharma.entity.User;
import com.tanwisharma.persistence.FavoriteDao;
import com.tanwisharma.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * A controller class to add favorite.
 *
 * @author tanwi
 */
@WebServlet(name = "AddToFavoriteController", urlPatterns = {"/AddToFavoriteController"})
public class AddToFavoriteController extends HttpServlet {
    //logger
    private final Logger logger = LogManager.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private FavoriteDao favoriteDao;
    User user = new User();
    UserDao userDao = new UserDao();

    /**
     * init method
     */
    public void init() {
        favoriteDao = new FavoriteDao();
    }

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user_name= request.getRemoteUser();
        user.setUser_name(user_name);
        user = userDao.getByUsername(user_name);
        Favorite newFavorite = new Favorite();
        newFavorite.setRecipeId(request.getParameter("recipeId"));
        newFavorite.setTitle(request.getParameter("title"));
        newFavorite.setUser(user);
        try {
            int id = favoriteDao.insert(newFavorite);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("userdetails.jsp");
    }
}
