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
 * A controller class to display user profile.
 *
 * @author tanwi
 */
@WebServlet(name = "UserProfileController", urlPatterns = {"/UserProfileController"})
public class UserProfileController extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private FavoriteDao favoriteDao;

    /**
     * init methid
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
        List<Favorite> recipes = new ArrayList<>();
        try {
            recipes = favoriteDao.getAllFavorite();
        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
        }
        String userName = recipes.get(0).getUser().getFirst_name();
        request.setAttribute("recipes", recipes);
        request.setAttribute("userName", userName);
        request.getRequestDispatcher("admin.jsp").forward(request, response);
    }
}
