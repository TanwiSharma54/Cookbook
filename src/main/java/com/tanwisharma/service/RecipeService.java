package com.tanwisharma.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tanwisharma.entity.RecipeNew;
import com.tanwisharma.entity.ResultsItem;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
/**
 * A service class for getting all the recipe using rest api.
 *
 * @author tanwi
 */
public class RecipeService {
    /**
     * @return
     * @throws JsonProcessingException
     */
    public static List<ResultsItem> fetchRecipe() throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.spoonacular.com/recipes/search?apiKey=3d9b9b507f5242119a52724610a22e79");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        RecipeNew recipeNew = mapper.readValue(response, RecipeNew.class);
        List<ResultsItem> recipes = new ArrayList<ResultsItem>();
        recipes = recipeNew.getResults();
        return recipes;
    }
}
