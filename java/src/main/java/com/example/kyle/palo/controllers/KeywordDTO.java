package com.example.kyle.palo.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class KeywordDTO {

	private Integer id;
	
	private String humanReadable;
	
	private String slug;
	
}
