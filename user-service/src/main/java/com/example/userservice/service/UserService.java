package com.example.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		log.info("Inside saveUser method in UserService ");
		
		return userRepository.save(user);
	}

}
