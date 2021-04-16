package com.amit.restapi.interview.models;

import java.io.Serializable;
import java.util.List;

public class SortRequest implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Integer> values;
	private List<Integer> options;
	
	public List<Integer> getValues() {
		return values;
	}
	public void setValues(List<Integer> values) {
		this.values = values;
	}
	public List<Integer> getOptions() {
		return options;
	}
	public void setOptions(List<Integer> options) {
		this.options = options;
	}
	 

	 
	
	
	
}
