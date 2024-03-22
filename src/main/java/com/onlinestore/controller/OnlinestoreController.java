package com.onlinestore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinestore.model.OnlinestoreModel;
import com.onlinestore.service.OnlinestoreService;



@RequestMapping("/onlinestore")
@RestController
public class OnlinestoreController {

	@Autowired
	 OnlinestoreService service;
	
	@PostMapping("/save")
	public OnlinestoreModel postOnlineStore(@RequestBody OnlinestoreModel model) {
		//TODO: process POST request
		service.save(model);
		return model;
	}
	
	@GetMapping("/getAll")
	public List<OnlinestoreModel> getOnlineStoreAll() {
		List<OnlinestoreModel> data=service.getAllData();
		return data;
	}
	
	@GetMapping("/get/{id}")
	public Optional<OnlinestoreModel> getOnlineStore(@PathVariable Long id) {
		Optional<OnlinestoreModel> dataById=service.getById(id);
		return dataById;
	}
	
	@PutMapping("/update/{id}")
	public OnlinestoreModel putOnlineStore(@RequestBody OnlinestoreModel model) {
		//TODO: process PUT request
		OnlinestoreModel updated=service.updateModel(model);
		return updated;
	}
	
	@DeleteMapping("/delete")
	public OnlinestoreModel deleteOnlineStore(@PathVariable String id, @RequestBody OnlinestoreModel model) {
		//TODO: process PUT request
		
		return model;
	}
	
	
}
