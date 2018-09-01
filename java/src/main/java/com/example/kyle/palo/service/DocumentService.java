package com.example.kyle.palo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kyle.palo.data.Document;

@Service
public class DocumentService {

	@Autowired
	DocumentRepository repo;
	
	public Document create(Document document) {
		
		repo.save(document);
		
		return document;

	}
	
	public Optional<Document> findDocument(Integer id) {
		return  repo.findById(id);
	}

	public List<Document> getAll() {
		return repo.findAll();
	}
	
	
}
