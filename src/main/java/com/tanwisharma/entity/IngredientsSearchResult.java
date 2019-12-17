package com.tanwisharma.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class IngredientsSearchResult{

	@JsonProperty("image")
	private String image;

	@JsonProperty("usedIngredients")
	private List<UsedIngredientsItem> usedIngredients;

	@JsonProperty("missedIngredients")
	private List<Object> missedIngredients;

	@JsonProperty("missedIngredientCount")
	private int missedIngredientCount;

	@JsonProperty("unusedIngredients")
	private List<Object> unusedIngredients;

	@JsonProperty("id")
	private int id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("imageType")
	private String imageType;

	@JsonProperty("usedIngredientCount")
	private int usedIngredientCount;

	@JsonProperty("likes")
	private int likes;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setUsedIngredients(List<UsedIngredientsItem> usedIngredients){
		this.usedIngredients = usedIngredients;
	}

	public List<UsedIngredientsItem> getUsedIngredients(){
		return usedIngredients;
	}

	public void setMissedIngredients(List<Object> missedIngredients){
		this.missedIngredients = missedIngredients;
	}

	public List<Object> getMissedIngredients(){
		return missedIngredients;
	}

	public void setMissedIngredientCount(int missedIngredientCount){
		this.missedIngredientCount = missedIngredientCount;
	}

	public int getMissedIngredientCount(){
		return missedIngredientCount;
	}

	public void setUnusedIngredients(List<Object> unusedIngredients){
		this.unusedIngredients = unusedIngredients;
	}

	public List<Object> getUnusedIngredients(){
		return unusedIngredients;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setImageType(String imageType){
		this.imageType = imageType;
	}

	public String getImageType(){
		return imageType;
	}

	public void setUsedIngredientCount(int usedIngredientCount){
		this.usedIngredientCount = usedIngredientCount;
	}

	public int getUsedIngredientCount(){
		return usedIngredientCount;
	}

	public void setLikes(int likes){
		this.likes = likes;
	}

	public int getLikes(){
		return likes;
	}

	@Override
 	public String toString(){
		return 
			"IngredientsSearchResult{" + 
			"image = '" + image + '\'' + 
			",usedIngredients = '" + usedIngredients + '\'' + 
			",missedIngredients = '" + missedIngredients + '\'' + 
			",missedIngredientCount = '" + missedIngredientCount + '\'' + 
			",unusedIngredients = '" + unusedIngredients + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",imageType = '" + imageType + '\'' + 
			",usedIngredientCount = '" + usedIngredientCount + '\'' + 
			",likes = '" + likes + '\'' + 
			"}";
		}
}