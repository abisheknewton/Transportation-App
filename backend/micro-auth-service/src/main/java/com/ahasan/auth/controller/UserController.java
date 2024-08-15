package com.ahasan.auth.controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahasan.auth.model.User;
import com.ahasan.auth.repository.UserDetailRepository;

@RestController
public class UserController {

	@Autowired
	private UserDetailRepository userRepo;

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		System.out.println(user);
		user.setPassword(encordPassword(user.getPassword()));
		return userRepo.save(user);
	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) throws IOException {
		Optional<User> isUserAvailable = userRepo.findById(user.getId());

		if (isUserAvailable.isPresent()) {
			isUserAvailable.get().setEmail(user.getEmail());
			isUserAvailable.get().setUsername(user.getUsername());
			return userRepo.save(isUserAvailable.get());
		} else {
			throw new IOException("User Not found");
		}

	}
	
	@PutMapping("/updatePassword")
	public User updatePassword(@RequestBody User user) throws IOException {
		Optional<User> isUserAvailable = userRepo.findById(user.getId());

		if (isUserAvailable.isPresent()) {
			System.out.println(decordPassword(user.getPassword(),isUserAvailable.get().getPassword()));
			if(decordPassword(user.getPassword(),isUserAvailable.get().getPassword())) {
				isUserAvailable.get().setPassword(encordPassword(user.getNewPassword()));
				return userRepo.save(isUserAvailable.get());
			}else {
				throw new IOException("Password Not match");
			}					
		} else {
			throw new IOException("User Not found");
		}

	}
	
	@PostMapping("/find")
	public User findUser(@RequestBody User user) throws IOException {
		Optional<User> isUserAvailable = userRepo.findByUsername(user.getUsername());
		if (isUserAvailable.isPresent()) {
			return isUserAvailable.get();
		} else {
			throw new IOException("User Not found");
		}
	}
	
	public static String encordPassword(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(password);
	}
	
	public static boolean decordPassword (String reqPassword,String dbPassword) {
		return BCrypt.checkpw(reqPassword, dbPassword);
	}
	

}
