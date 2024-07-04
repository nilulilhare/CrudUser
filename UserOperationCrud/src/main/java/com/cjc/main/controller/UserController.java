package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.main.model.User;
import com.cjc.main.service.UserInterface;

@RequestMapping
public class UserController {
	@Autowired private UserInterface ui;
	public ResponseEntity<User> SaveData(@RequestBody User u)
	{
		User uData=ui.saveUserData(u);
		return new ResponseEntity<User>(HttpStatus.CREATED);
	}

}
