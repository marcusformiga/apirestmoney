package com.apirestmoney.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestmoney.api.model.CategoryModel;
import com.apirestmoney.api.repository.CategoryRepository;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	private CategoryRepository repository;
	public CategoryController(CategoryRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public List<CategoryModel> findAll(){
		return repository.findAll();
	}
	@PostMapping
	public ResponseEntity<CategoryModel> create(@Valid @RequestBody CategoryModel category){
		repository.save(category);
		return new ResponseEntity<CategoryModel>(category, HttpStatus.CREATED);
	}
	@GetMapping(path = "/{id}")
	public ResponseEntity<CategoryModel> findById(@PathVariable Integer id){
		CategoryModel category = repository.findById(id).get();
		return new ResponseEntity<CategoryModel>(category, HttpStatus.OK);
	}
}
