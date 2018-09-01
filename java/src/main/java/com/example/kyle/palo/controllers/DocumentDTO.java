package com.example.kyle.palo.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDTO {

	@Getter
	private Integer id;
	
	@Getter
	private String title;
	
}
