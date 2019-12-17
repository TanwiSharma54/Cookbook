package com.tanwisharma.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class UsedIngredientsItem{

	@JsonProperty("originalName")
	private String originalName;

	@JsonProperty("image")
	private String image;

	@JsonProperty("amount")
	private int amount;

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("unitShort")
	private String unitShort;

	@JsonProperty("original")
	private String original;

	@JsonProperty("name")
	private String name;

	@JsonProperty("unitLong")
	private String unitLong;

	@JsonProperty("originalString")
	private String originalString;

	@JsonProperty("id")
	private int id;

	@JsonProperty("aisle")
	private String aisle;

	@JsonProperty("metaInformation")
	private List<String> metaInformation;



	/*start */
	@JsonProperty("extendedName")
	private String extendedName;
	public String getExtendedName() {
		return extendedName;
	}

	public void setExtendedName(String extendedName) {
		this.extendedName = extendedName;
	}
	/*end */

	public void setOriginalName(String originalName){
		this.originalName = originalName;
	}

	public String getOriginalName(){
		return originalName;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setAmount(int amount){
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setUnitShort(String unitShort){
		this.unitShort = unitShort;
	}

	public String getUnitShort(){
		return unitShort;
	}

	public void setOriginal(String original){
		this.original = original;
	}

	public String getOriginal(){
		return original;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUnitLong(String unitLong){
		this.unitLong = unitLong;
	}

	public String getUnitLong(){
		return unitLong;
	}

	public void setOriginalString(String originalString){
		this.originalString = originalString;
	}

	public String getOriginalString(){
		return originalString;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAisle(String aisle){
		this.aisle = aisle;
	}

	public String getAisle(){
		return aisle;
	}

	public void setMetaInformation(List<String> metaInformation){
		this.metaInformation = metaInformation;
	}

	public List<String> getMetaInformation(){
		return metaInformation;
	}

	@Override
 	public String toString(){
		return 
			"UsedIngredientsItem{" + 
			"originalName = '" + originalName + '\'' + 
			",image = '" + image + '\'' + 
			",amount = '" + amount + '\'' + 
			",unit = '" + unit + '\'' + 
			",unitShort = '" + unitShort + '\'' + 
			",original = '" + original + '\'' + 
			",name = '" + name + '\'' + 
			",unitLong = '" + unitLong + '\'' + 
			",originalString = '" + originalString + '\'' + 
			",id = '" + id + '\'' + 
			",aisle = '" + aisle + '\'' + 
			",metaInformation = '" + metaInformation + '\'' +
					",extendedName = '" + extendedName + '\'' +
			"}";
		}
}