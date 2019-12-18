package com.tanwisharma.controller;
import com.tanwisharma.entity.Favorite;
import com.tanwisharma.persistence.FavoriteDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * A controller class to remove favorite from user profile.
 *
 * @author tanwi
 */

@WebServlet(name = "RemoveFavoriteController", urlPatterns = {"/RemoveFavoriteController"})
public class RemoveFavoriteController extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private FavoriteDao favoriteDao;

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
        favoriteDao = new FavoriteDao();
        Favorite newFavorite;
        List<Favorite> recipes = new ArrayList<>();
        int id = Integer.parseInt(request.getParameter("favId"));
        newFavorite = favoriteDao.getById(id);
        try {
            favoriteDao.delete(newFavorite);
            recipes = favoriteDao.getAllFavorite();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String userName = recipes.get(0).getUser().getFirst_name();
        request.setAttribute("recipes", recipes);
        request.setAttribute("userName", userName);
        request.getRequestDispatcher("admin.jsp").forward(request, response);
    }
}
