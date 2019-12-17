package com.tanwisharma.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tanwisharma.entity.NutrientsSearch;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

public class SearchRecipesbyNutrientsService {
    public static List<NutrientsSearch> fetchRecipe(String nutrientsType, String limit) throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.spoonacular.com/recipes/findByNutrients?apiKey=3d9b9b507f5242119a52724610a22e79&"+nutrientsType +"=" +limit);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        NutrientsSearch[] recipeNew = mapper.readValue(response, NutrientsSearch[].class);
        List<NutrientsSearch> recipes = Arrays.asList(recipeNew);
        return recipes;
    }
}
