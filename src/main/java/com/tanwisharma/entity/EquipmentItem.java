package com.tanwisharma.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class EquipmentItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("name")
	private String name;

	@JsonProperty("temperature")
	private Temperature temperature;

	@JsonProperty("id")
	private int id;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTemperature(Temperature temperature){
		this.temperature = temperature;
	}

	public Temperature getTemperature(){
		return temperature;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"EquipmentItem{" + 
			"image = '" + image + '\'' + 
			",name = '" + name + '\'' + 
			",temperature = '" + temperature + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}