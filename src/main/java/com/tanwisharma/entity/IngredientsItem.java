package com.tanwisharma.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
/**
 * A Entity class for IngredientsItem.
 *
 * @author tanwi
 */
@Generated("com.robohorse.robopojogenerator")
public class IngredientsItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

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
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getName(){
		return name;
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

	@Override
 	public String toString(){
		return 
			"IngredientsItem{" + 
			"image = '" + image + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}