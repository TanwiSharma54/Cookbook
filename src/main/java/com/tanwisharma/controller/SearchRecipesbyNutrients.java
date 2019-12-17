package com.tanwisharma.controller;

import com.tanwisharma.entity.IngredientsSearchResult;
import com.tanwisharma.entity.NutrientsSearch;
import com.tanwisharma.entity.Recipe;
import com.tanwisharma.service.RecipeSearchByIngredientsService;
import com.tanwisharma.service.RecipeService;
import com.tanwisharma.service.SearchRecipesbyNutrientsService;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "SearchRecipesbyNutrients", urlPatterns = {"/SearchRecipesbyNutrients"})
public class SearchRecipesbyNutrients extends HttpServlet {

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
