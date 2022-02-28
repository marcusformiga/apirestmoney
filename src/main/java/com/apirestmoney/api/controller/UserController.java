package com.apirestmoney.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestmoney.api.model.UserModel;
import com.apirestmoney.api.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	private UserRepository repository;
	public UserController(UserRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping
	public ResponseEntity<UserModel> create(@RequestBody UserModel user){
		repository.save(user);
		return new ResponseEntity<UserModel>(user, HttpStatus.CREATED);
	}
}
