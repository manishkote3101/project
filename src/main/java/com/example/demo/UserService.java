package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//This annotation marks the class as a Spring service
@Service
public class UserService {
// This annotation autowires the UserRepository dependency
	@Autowired
	UserRepository repository;
	void saveUser(Users user) {
		repository.save(user);
		System.out.println("user created " + user.getName());
}
	public Iterable<Users> getAllUsers() {
		return repository.findAll();
	}
	public void deleteUser(int id) {
		repository.deleteById(id);	
	}
	public void updateUser(int id,Users updatedUser) {
		repository.save(updatedUser);
	}
}