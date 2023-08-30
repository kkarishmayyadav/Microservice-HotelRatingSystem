package com.lcwd.user.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.services.Userservice;


@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private Userservice userService;

	//create
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User user1= userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	//single user
	@GetMapping("/{userId}")
	public ResponseEntity<User> singleUser(@PathVariable String userId) {
		User user= userService.getUserById(userId);
		return ResponseEntity.ok(user);
	}
	
	//All user
	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allusers= userService.getAllUser();
		return ResponseEntity.ok(allusers);
	}
	
}
