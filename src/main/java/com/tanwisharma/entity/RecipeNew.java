package com.tanwisharma.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RecipeNew{

	@JsonProperty("number")
	private int number;

	@JsonProperty("totalResults")
	private int totalResults;

	@JsonProperty("expires")
	private long expires;

	@JsonProperty("offset")
	private int offset;

	@JsonProperty("processingTimeMs")
	private int processingTimeMs;

	@JsonProperty("baseUri")
	private String baseUri;

	@JsonProperty("isStale")
	private boolean isStale;

	@JsonProperty("results")
	private List<ResultsItem> results;

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	public void setExpires(long expires){
		this.expires = expires;
	}

	public long getExpires(){
		return expires;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setProcessingTimeMs(int processingTimeMs){
		this.processingTimeMs = processingTimeMs;
	}

	public int getProcessingTimeMs(){
		return processingTimeMs;
	}

	public void setBaseUri(String baseUri){
		this.baseUri = baseUri;
	}

	public String getBaseUri(){
		return baseUri;
	}

	public void setIsStale(boolean isStale){
		this.isStale = isStale;
	}

	public boolean isIsStale(){
		return isStale;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"RecipeNew{" + 
			"number = '" + number + '\'' + 
			",totalResults = '" + totalResults + '\'' + 
			",expires = '" + expires + '\'' + 
			",offset = '" + offset + '\'' + 
			",processingTimeMs = '" + processingTimeMs + '\'' + 
			",baseUri = '" + baseUri + '\'' + 
			",isStale = '" + isStale + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}