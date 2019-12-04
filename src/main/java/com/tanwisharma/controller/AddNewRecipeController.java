package com.tanwisharma.controller;

import com.tanwisharma.entity.Recipe;
import com.tanwisharma.entity.User;
import com.tanwisharma.persistence.RecipeDao;
import com.tanwisharma.persistence.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddNewRecipeController", urlPatterns = {"/AddNewRecipeController"})
public class AddNewRecipeController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private RecipeDao recipeDao;

    public void init() {
        recipeDao = new RecipeDao();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String servings = request.getParameter("servings");
        String readyInMinutes = request.getParameter("readyInMinutes");
        String imageUrls = request.getParameter("imageUrls");

        Recipe recipe = new Recipe();



    }
}
