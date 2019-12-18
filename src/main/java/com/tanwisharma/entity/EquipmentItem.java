package com.tanwisharma.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
/**
 * A EquipmentItem class.
 *
 * @author tanwi
 */
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

	/**
	 * @param image
	 */
	public void setImage(String image){
		this.image = image;
	}

	/**
	 * @return image
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
	 * @return name
	 */
	public String getName(){
		return name;
	}

	/**
	 * @param temperature
	 */
	public void setTemperature(Temperature temperature){
		this.temperature = temperature;
	}

	/**
	 * @return temprature
	 */
	public Temperature getTemperature(){
		return temperature;
	}

	/**
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * @return id
	 */
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