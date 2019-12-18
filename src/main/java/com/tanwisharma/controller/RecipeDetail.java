package com.tanwisharma.controller;

import com.tanwisharma.entity.RecipeInstructions;
import com.tanwisharma.entity.StepsItem;
import com.tanwisharma.service.RecipeDetailService;
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
 * A controller class to display recipe detail.
 *
 * @author tanwi
 */
@WebServlet(name = "RecipeDetail", urlPatterns = {"/RecipeDetail"})
public class RecipeDetail extends HttpServlet {
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
