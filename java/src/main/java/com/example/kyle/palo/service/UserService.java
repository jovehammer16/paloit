package com.example.kyle.palo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kyle.palo.data.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public User create(User user) {
		
		return userRepo.save(user);
		
	}

	
	
	
}
