package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;

import com.cjc.main.model.User;
import com.cjc.main.service.UserInterface;

@RequestMapping
public class UserController {
	@Autowired private UserInterface ui;
	@PostMapping("/SaveData")
	public ResponseEntity<User> SaveData(@RequestBody User u)
	{
		User uData=ui.saveUserData(u);
		return new ResponseEntity<User>(HttpStatus.CREATED);
	}
	@GetMapping("/getSingleData/{id}")
	public ResponseEntity<User>GetSingleData(@RequestPart int id )
	{
		User uData=ui.getSingleData(id);
		return new ResponseEntity<User>(uData,HttpStatus.OK);
		
	}

}
