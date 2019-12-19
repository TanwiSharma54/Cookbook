package com.tanwisharma.controller;

import com.tanwisharma.entity.ResultsItem;
import com.tanwisharma.service.RecipeService;
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
 * A controller class to get all recipes from spoonacular api.
 *
 * @author tanwi
 */
@WebServlet(name = "AllRecipesController", urlPatterns = {"/AllRecipesController"})
public class AllRecipesController extends HttpServlet {
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
        List<ResultsItem> recipes = RecipeService.fetchRecipe();

        request.setAttribute("recipes", recipes);
        request.getRequestDispatcher("Recipes.jsp").forward(request, response);
    }
}
