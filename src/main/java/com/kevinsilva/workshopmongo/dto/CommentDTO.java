package com.kevinsilva.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CommentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String text;
	private Date date;
	private AutorDTO autor;
}
