package com.tanwisharma.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tanwisharma.entity.IngredientsSearchResult;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;
/**
 * A service class for searching recipe by ingedients.
 *
 * @author tanwi
 */
public class RecipeSearchByIngredientsService {
    /**
     * @param ingredients
     * @return
     * @throws JsonProcessingException
     */
    public static List<IngredientsSearchResult> fetchRecipe(String ingredients) throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.spoonacular.com/recipes/findByIngredients?apiKey=3d9b9b507f5242119a52724610a22e79&ingredients="+ingredients);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        IngredientsSearchResult[] recipeNew = mapper.readValue(response, IngredientsSearchResult[].class);
        List<IngredientsSearchResult> recipes = Arrays.asList(recipeNew);
        return recipes;
    }
}
