package com.tanwisharma.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class NutrientsSearch{

	@JsonProperty("image")
	private String image;

	@JsonProperty("carbs")
	private String carbs;

	@JsonProperty("protein")
	private String protein;

	@JsonProperty("fat")
	private String fat;

	@JsonProperty("id")
	private int id;

	@JsonProperty("calories")
	private int calories;

	@JsonProperty("title")
	private String title;

	@JsonProperty("imageType")
	private String imageType;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setCarbs(String carbs){
		this.carbs = carbs;
	}

	public String getCarbs(){
		return carbs;
	}

	public void setProtein(String protein){
		this.protein = protein;
	}

	public String getProtein(){
		return protein;
	}

	public void setFat(String fat){
		this.fat = fat;
	}

	public String getFat(){
		return fat;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCalories(int calories){
		this.calories = calories;
	}

	public int getCalories(){
		return calories;
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

	@Override
 	public String toString(){
		return 
			"NutrientsSearch{" + 
			"image = '" + image + '\'' + 
			",carbs = '" + carbs + '\'' + 
			",protein = '" + protein + '\'' + 
			",fat = '" + fat + '\'' + 
			",id = '" + id + '\'' + 
			",calories = '" + calories + '\'' + 
			",title = '" + title + '\'' + 
			",imageType = '" + imageType + '\'' + 
			"}";
		}
}