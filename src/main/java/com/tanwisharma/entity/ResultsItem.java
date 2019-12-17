package com.tanwisharma.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ResultsItem{

	@JsonProperty("readyInMinutes")
	private int readyInMinutes;

	@JsonProperty("image")
	private String image;

	@JsonProperty("servings")
	private int servings;

	@JsonProperty("imageUrls")
	private List<String> imageUrls;

	@JsonProperty("id")
	private int id;

	@JsonProperty("title")
	private String title;

	public void setReadyInMinutes(int readyInMinutes){
		this.readyInMinutes = readyInMinutes;
	}

	public int getReadyInMinutes(){
		return readyInMinutes;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setServings(int servings){
		this.servings = servings;
	}

	public int getServings(){
		return servings;
	}

	public void setImageUrls(List<String> imageUrls){
		this.imageUrls = imageUrls;
	}

	public List<String> getImageUrls(){
		return imageUrls;
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

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"readyInMinutes = '" + readyInMinutes + '\'' + 
			",image = '" + image + '\'' + 
			",servings = '" + servings + '\'' + 
			",imageUrls = '" + imageUrls + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}