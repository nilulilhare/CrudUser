package com.cjc.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.User;
import com.cjc.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserInterface {
	@Autowired private UserRepository ur;
	@Override
	public User saveUserData(User u) {
		
		return ur.save(u);
	}
	@Override
	public User getSingleData(int id) {
		Optional<User> data=ur.findById(id);
		return data.get();
	}
	@Override
	public List<User> getAllUserDetails() {
	Iterable<User>data=ur.findAll();
		return (List<User>) data;
	}
	
	
	

}
