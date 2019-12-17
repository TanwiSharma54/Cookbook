package com.tanwisharma.controller;

import com.tanwisharma.entity.IngredientsSearchResult;
import com.tanwisharma.entity.Recipe;
import com.tanwisharma.entity.RecipeInstructions;
import com.tanwisharma.entity.StepsItem;
import com.tanwisharma.service.RecipeDetailService;
import com.tanwisharma.service.RecipeSearchByIngredientsService;
import com.tanwisharma.service.RecipeService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "RecipeDetail", urlPatterns = {"/RecipeDetail"})
public class RecipeDetail extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String recipeId = request.getParameter("recipeId");
        String title = request.getParameter("title");
        String image = request.getParameter("image");
        List<RecipeInstructions> recipeInstructions = RecipeDetailService.fetchRecipe(recipeId);
        List<StepsItem> recipeSteps = recipeInstructions.get(0).getSteps();
        request.setAttribute("recipeSteps", recipeSteps);
        request.setAttribute("title", title);
        request.setAttribute("image", image);
        request.getRequestDispatcher("RecipeDetails.jsp").forward(request, response);
    }
}
