package com.tanwisharma.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
/**
 * A Entity class for IngredientsSearchResult.
 *
 * @author tanwi
 */
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

	/**
	 * @param image
	 */
	public void setImage(String image){
		this.image = image;
	}

	/**
	 * @return
	 */
	public String getImage(){
		return image;
	}

	/**
	 * @param usedIngredients
	 */
	public void setUsedIngredients(List<UsedIngredientsItem> usedIngredients){
		this.usedIngredients = usedIngredients;
	}

	/**
	 * @return
	 */
	public List<UsedIngredientsItem> getUsedIngredients(){
		return usedIngredients;
	}

	/**
	 * @param missedIngredients
	 */
	public void setMissedIngredients(List<Object> missedIngredients){
		this.missedIngredients = missedIngredients;
	}

	/**
	 * @return
	 */
	public List<Object> getMissedIngredients(){
		return missedIngredients;
	}

	/**
	 * @param missedIngredientCount
	 */
	public void setMissedIngredientCount(int missedIngredientCount){
		this.missedIngredientCount = missedIngredientCount;
	}

	/**
	 * @return
	 */
	public int getMissedIngredientCount(){
		return missedIngredientCount;
	}

	/**
	 * @param unusedIngredients
	 */
	public void setUnusedIngredients(List<Object> unusedIngredients){
		this.unusedIngredients = unusedIngredients;
	}

	/**
	 * @return
	 */
	public List<Object> getUnusedIngredients(){
		return unusedIngredients;
	}

	/**
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * @return
	 */
	public int getId(){
		return id;
	}

	/**
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * @return
	 */
	public String getTitle(){
		return title;
	}

	/**
	 * @param imageType
	 */
	public void setImageType(String imageType){
		this.imageType = imageType;
	}

	/**
	 * @return
	 */
	public String getImageType(){
		return imageType;
	}

	/**
	 * @param usedIngredientCount
	 */
	public void setUsedIngredientCount(int usedIngredientCount){
		this.usedIngredientCount = usedIngredientCount;
	}

	/**
	 * @return
	 */
	public int getUsedIngredientCount(){
		return usedIngredientCount;
	}

	/**
	 * @param likes
	 */
	public void setLikes(int likes){
		this.likes = likes;
	}

	/**
	 * @return
	 */
	public int getLikes(){
		return likes;
	}

	/**
	 * @return
	 */
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