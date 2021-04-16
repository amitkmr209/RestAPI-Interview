package com.amit.restapi.interview.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.amit.restapi.interview.models.SortRequest;

@Service
public class SortIntService {
	
	public List<Integer> sortIntReq(@RequestBody SortRequest sortRequest){
		List<Integer> afterSortList = null;
		try {
			List<Integer> values = sortRequest.getValues();
			List<Integer> options = sortRequest.getOptions();
			values.addAll(options);
			Collections.sort(values);
			afterSortList = new ArrayList<Integer>(values);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
		return afterSortList;
	}

}
