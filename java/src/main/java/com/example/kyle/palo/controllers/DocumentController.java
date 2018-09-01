package com.example.kyle.palo.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kyle.palo.data.Document;
import com.example.kyle.palo.data.Keyword;
import com.example.kyle.palo.data.User;
import com.example.kyle.palo.service.DocumentService;
import com.example.kyle.palo.service.KeywordService;
import com.example.kyle.palo.service.UserService;

@RestController
public class DocumentController {

	private DocumentService documentService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private KeywordService keywordService;
	
	@Autowired
	public DocumentController(DocumentService documentService) {
		this.documentService = documentService;
	}
	
	
	@PostMapping("/documents")
	public DocumentDTO createDocument(@RequestBody Document document) {
		
		Document storedDocument = documentService.create(document);
		
		return DocumentMapper.map(storedDocument);
	}
	
	@PostMapping("/users")
	public UserDTO createUser(@RequestBody UserInputDTO user) {
		
		User u = User.builder().firstName(user.getFirstName()).lastName(user.getLastName()).build();
		
		User createdUser = userService.create(u);
		
		return UserDTO.builder().firstName(createdUser.getFirstName()).lastName(createdUser.getLastName()).id(createdUser.getId()).build();	
	}
	
	@PostMapping("/keywords")
	public KeywordDTO createKeyword(@RequestBody KeywordInputDTO keyword) {
		
		Keyword k = Keyword.builder().humanReadable(keyword.getHumanReadable()).slug(keyword.getSlug()).build();
		
		Keyword createdKeyword = keywordService.createKeyword(k);
		
		return KeywordDTO.builder().humanReadable(createdKeyword.getHumanReadable()).slug(createdKeyword.getSlug()).id(createdKeyword.getId()).build();	
	}
	
	@PutMapping("/documents/{id}/keywords")
	public DocumentDTO addKeywords(@PathVariable("id") Integer id, @RequestBody List<Integer> keywordIds) {
		
		List<Keyword> keywordObjects = keywordIds.stream()
			.map(keywordId -> keywordService.findKeyword(keywordId))
			.filter(optionalKeyword -> optionalKeyword.isPresent())
			.map(optionalKeyword -> optionalKeyword.get())
			.collect(Collectors.toList());
		
		
		Optional<Document> document = documentService.findDocument(id);
		
		if(document.isPresent()) {
			
			document.get().getKeywords().add(e);
			
		}
		
		
	}
	
	@GetMapping("/documents")
	public List<Document> getAllDocuments() {
		return documentService.getAll();	
	}
	
	
	
}
