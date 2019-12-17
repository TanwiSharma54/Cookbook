package com.tanwisharma.controller;

import com.tanwisharma.entity.IngredientsSearchResult;
import com.tanwisharma.entity.Recipe;
import com.tanwisharma.service.RecipeSearchByIngredientsService;
import com.tanwisharma.service.RecipeService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "SearchByIngredientsController", urlPatterns = {"/SearchByIngredientsController"})
public class SearchByIngredientsController extends HttpServlet {

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
