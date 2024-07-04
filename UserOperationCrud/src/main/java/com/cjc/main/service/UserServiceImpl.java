package com.cjc.main.service;

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
	

}
