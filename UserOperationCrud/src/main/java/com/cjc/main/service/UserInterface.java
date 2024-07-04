package com.cjc.main.service;

import com.cjc.main.model.User;

public interface UserInterface {
	public User saveUserData(User u);
	public User getSingleData(int id);

}
