package com.tanwisharma.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tanwisharma.entity.RecipeInstructions;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;
/**
 * A service class for getting recipe datail.
 *
 * @author tanwi
 */
public class RecipeDetailService {
    /**
     * @param recipeId
     * @return
     * @throws JsonProcessingException
     */
    public static List<RecipeInstructions> fetchRecipe(String recipeId) throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.spoonacular.com/recipes/"+recipeId+"/analyzedInstructions?apiKey=3d9b9b507f5242119a52724610a22e79");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        RecipeInstructions[] recipeNewArr = mapper.readValue(response, RecipeInstructions[].class);
        List<RecipeInstructions> recipeNew = Arrays.asList(recipeNewArr);
        return recipeNew;
    }
}
