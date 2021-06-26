package com.kevinsilva.workshopmongo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevinsilva.workshopmongo.domain.User;

@RestController
public class UserController {

	@GetMapping(value = "/users")
	public ResponseEntity<List<User>> findAll() {
	
		User maria = new User("1", "Maria Silva", "Maria@gmail.com");
		User alex = new User("2", "Alex Green", "Alex@gmail.com");
		User kevin = new User("3", "Kevin Silva", "Kevin@gmail.com");
		
		List<User> list = new ArrayList<>();
	
		list.addAll(Arrays.asList(maria, alex, kevin));
		
		return ResponseEntity.ok().body(list);
		

	}
}
