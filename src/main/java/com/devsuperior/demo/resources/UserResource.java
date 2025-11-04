package com.devsuperior.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(
				1L,
				"João", 
				"joao@gmail.com",
				"+5511996654421",
				"88554165");
		
		return ResponseEntity.ok().body(user);
	}
}
