package com.example.MultipleDataBases.userService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MultipleDataBases.model.user.User;
import com.example.MultipleDataBases.userrepo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;

	@Override
	public User saveUser(User user) {
		return repo.save(user);
	}

	@Override
	public List<User> getAll() {
 		return repo.findAll();
	}
}
