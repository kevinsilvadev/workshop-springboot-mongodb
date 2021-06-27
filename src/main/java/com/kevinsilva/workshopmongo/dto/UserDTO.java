package com.kevinsilva.workshopmongo.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kevinsilva.workshopmongo.domain.User;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "id")
@Document
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String name;
	private String email;
	
	public UserDTO(User obj) {
		id = obj.getId();
		id = obj.getName();
		id = obj.getEmail();
	}
}
