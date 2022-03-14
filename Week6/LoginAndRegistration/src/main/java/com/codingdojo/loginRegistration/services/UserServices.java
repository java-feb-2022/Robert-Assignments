package com.codingdojo.loginRegistration.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.loginRegistration.models.User;
import com.codingdojo.loginRegistration.repositories.UserRepository;

@Service
public class UserServices {
	private final UserRepository userRepo;
	
	public UserServices(UserRepository userRepository) {
		this.userRepo = userRepository;
	}
	
	public User createUser(User user) {
		Optional<User> optUser = userRepo.findByEmail(user.getEmail());
		if(optUser.isPresent()) {
			return null;
		}
		else {
			return userRepo.save(user);
		}
	}
	
	public User findUser(Long id) {
		Optional<User> optUser = userRepo.findById(id);
		if(optUser.isPresent()) {
			return optUser.get();
		}
		else {
			return null;
		}
	}
}
