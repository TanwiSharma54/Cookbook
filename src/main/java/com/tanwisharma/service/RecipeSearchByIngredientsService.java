package com.tanwisharma.service;

import com.tanwisharma.entity.Recipe;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
public class RecipeSearchByIngredientsService {
    public static String fetchRecipe(String ingredients)  {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.spoonacular.com/recipes/findByIngredients?apiKey=3d9b9b507f5242119a52724610a22e79&ingredients="+ingredients);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        return response;
    }
}
