package com.kevinsilva.workshopmongo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevinsilva.workshopmongo.domain.User;
import com.kevinsilva.workshopmongo.dto.UserDTO;
import com.kevinsilva.workshopmongo.services.UserService;

@RestController
@Controller
public class UserController {

	
	@Autowired
	private UserService service;
	
	@GetMapping(value = "/users")
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> list = service.findAll();
		List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDTO);

	}
}
