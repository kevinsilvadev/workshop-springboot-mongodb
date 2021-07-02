package com.kevinsilva.workshopmongo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kevinsilva.workshopmongo.dto.AutorDTO;
import com.kevinsilva.workshopmongo.dto.CommentDTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = "id")
@Document
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private Date date;
	private String title;
	private String body;
	private AutorDTO author;
	private List<CommentDTO> comments = new ArrayList<>();

	public Post(String id, Date date, String title, String body, AutorDTO author) {

		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.author = author;
	}



}
