package com.example.kyle.palo.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;


import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Document {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	private String title;
	
	private String body;
	
	@OneToMany
	private List<User> authors;
	
	@OneToMany
	private List<Keyword> keywords;
	
}
