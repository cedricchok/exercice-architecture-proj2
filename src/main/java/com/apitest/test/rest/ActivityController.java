package com.apitest.test.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apitest.test.models.Activity;
import com.apitest.test.services.ActivityService;

@RestController
@RequestMapping("/activities")
public class ActivityController {
	
	//@Autowired
	private ActivityService actiService;
	
	@GetMapping
	public List<Activity> findAll() {
		return actiService.findAll();
	}

}
