package com.amit.restapi.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.restapi.interview.models.SortRequest;
import com.amit.restapi.interview.models.SortResponse;
import com.amit.restapi.interview.service.SortIntService;



@RestController
@RequestMapping("/app/test/")
public class SortIntRestController {
	
	@Autowired
	private SortIntService sortIntService;
	
	@PostMapping("/sortint")
	public SortResponse sortIntReq(@RequestBody SortRequest sortRequest){
		SortResponse sortResponse = new SortResponse();
		List<Integer> afterSortList = sortIntService.sortIntReq(sortRequest) ;
		sortResponse.setValues(afterSortList);
		sortResponse.setStatus("Success");
		return sortResponse;
	}
	
	
	@GetMapping("/testjj")
	public String  testjj(){
		return "good Amit";
	}
	

}
