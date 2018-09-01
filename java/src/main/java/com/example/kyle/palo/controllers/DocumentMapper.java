package com.example.kyle.palo.controllers;

import com.example.kyle.palo.data.Document;

public class DocumentMapper {
	
	public static DocumentDTO map(Document document) {
		
		return DocumentDTO.builder().id(document.getId()).title(document.getTitle()).build();
		
	}

}
