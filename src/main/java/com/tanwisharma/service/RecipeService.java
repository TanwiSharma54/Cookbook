package com.tanwisharma.service;

import com.tanwisharma.entity.Recipe;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
public class RecipeService {

    public static String fetchRecipe()  {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.spoonacular.com/recipes/search?apiKey=3d9b9b507f5242119a52724610a22e79");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        return response;
    }
}
