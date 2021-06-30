package com.kevinsilva.workshopmongo.dto;

import java.io.Serializable;

import com.kevinsilva.workshopmongo.domain.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AutorDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AutorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}
	
}
