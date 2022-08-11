package com.example.MultipleDataBases.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MultipleDataBases.model.user.User;
import com.example.MultipleDataBases.userService.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("save")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@GetMapping("getAll")
	public List<User> getAll() {
		return service.getAll();
	}

}
