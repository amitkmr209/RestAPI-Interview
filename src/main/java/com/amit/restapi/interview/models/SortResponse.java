package com.amit.restapi.interview.models;

import java.io.Serializable;
import java.util.List;

public class SortResponse implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Integer> values;
	private String status;
	
	public List<Integer> getValues() {
		return values;
	}
	public void setValues(List<Integer> values) {
		this.values = values;
	}
	 
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	 
	
	
	
}
