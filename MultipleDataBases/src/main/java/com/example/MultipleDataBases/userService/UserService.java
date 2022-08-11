package com.example.MultipleDataBases.userService;

import java.util.List;

import com.example.MultipleDataBases.model.user.User;

public interface UserService {

	public User saveUser(User user );
	public List<User>getAll();
}
