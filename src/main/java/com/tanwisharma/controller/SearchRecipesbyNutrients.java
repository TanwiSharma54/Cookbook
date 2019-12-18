package com.tanwisharma.controller;

import com.tanwisharma.entity.NutrientsSearch;
import com.tanwisharma.service.SearchRecipesbyNutrientsService;
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
 * A controller class to search recipes by nutrients.
 *
 * @author tanwi
 */
@WebServlet(name = "SearchRecipesbyNutrients", urlPatterns = {"/SearchRecipesbyNutrients"})
public class SearchRecipesbyNutrients extends HttpServlet {
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
        String nutrientsType = request.getParameter("nutrientsType");
        String limit = request.getParameter("limit");
        List<NutrientsSearch>
                recipes = SearchRecipesbyNutrientsService.fetchRecipe(nutrientsType, limit);
        request.setAttribute("recipes", recipes);
        request.getRequestDispatcher("SearchRecipesbyNutrients.jsp").forward(request, response);
    }
}
