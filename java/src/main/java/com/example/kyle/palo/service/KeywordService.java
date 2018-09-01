package com.example.kyle.palo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kyle.palo.data.Keyword;

@Service
public class KeywordService {

	@Autowired
	KeywordRepository keywordRepo;
	
	
	public Keyword createKeyword(Keyword keyword) {
		return keywordRepo.save(keyword);
	}
	
	public Optional<Keyword> findKeyword(Integer id) {
		return keywordRepo.findById(id);
	}
	
}
