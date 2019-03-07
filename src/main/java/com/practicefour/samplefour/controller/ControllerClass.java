package com.practicefour.samplefour.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practicefour.samplefour.exception.ResourceNotFoundException;
import com.practicefour.samplefour.model.ModelClass;
import com.practicefour.samplefour.repo.RepoClass;
import com.practicefour.samplefour.repo.Repoclasstwo;

@RestController
@RequestMapping("/api/v6")
public class ControllerClass {
	@Autowired
	private RepoClass repo;
	@Autowired
	private Repoclasstwo Repo;
	
	@GetMapping("/get")
	public List<ModelClass> getAllnames(){
		return repo.findAll();
	}
	@PostMapping("/get")
	public ModelClass Modelobj(@Valid @RequestBody ModelClass model) {
		return repo.save(model);
	}
	
	@GetMapping("/address/{lastname}")
	public List<ModelClass>modelobj(@PathVariable (value="lastname") String lastname) {
		return Repo.getaddressbylastname(lastname);
	}
	
	@PutMapping("/putmapping/{id}")
	public ModelClass updatenameById(@PathVariable long id, @Valid @RequestBody ModelClass objmodel) {
		return repo.findById(id)
				.map(model -> {
					model.setFirstname(objmodel.getFirstname());
					return repo.save(model);
				}).orElseThrow(() -> new ResourceNotFoundException("Id not found" + id));
					
}
}
				
	

