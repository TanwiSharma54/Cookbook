package com.tanwisharma.controller;
import com.tanwisharma.entity.IngredientsSearchResult;
import com.tanwisharma.service.RecipeSearchByIngredientsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * A controller class to search recipes by ingredients and get list from api.
 *
 * @author tanwi
 */
@WebServlet(name = "SearchByIngredientsController", urlPatterns = {"/SearchByIngredientsController"})
public class SearchByIngredientsController extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ingredients = request.getParameter("ingredients");
        List<IngredientsSearchResult> recipes = RecipeSearchByIngredientsService.fetchRecipe(ingredients);

        request.setAttribute("recipes", recipes);
        request.getRequestDispatcher("SearchByIngredients.jsp").forward(request, response);
    }
}
