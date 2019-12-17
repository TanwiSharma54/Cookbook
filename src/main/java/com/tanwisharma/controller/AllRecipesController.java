package com.tanwisharma.controller;

import com.tanwisharma.entity.Recipe;
import com.tanwisharma.entity.ResultsItem;
import com.tanwisharma.service.RecipeService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "AllRecipesController", urlPatterns = {"/AllRecipesController"})
public class AllRecipesController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        // List<Recipe> recipes = RecipeService.fetchRecipe(0, 50);
        List<ResultsItem> recipes = RecipeService.fetchRecipe();

        request.setAttribute("recipes", recipes);
        request.getRequestDispatcher("Recipes.jsp").forward(request, response);
    }
}
