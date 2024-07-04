package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.User;

public interface UserInterface {
	public User saveUserData(User u);
	public User getSingleData(int id);
	public List<User> getAllUserDetails();

}
