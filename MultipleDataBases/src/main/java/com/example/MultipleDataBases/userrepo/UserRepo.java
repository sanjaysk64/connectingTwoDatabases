package com.example.MultipleDataBases.userrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MultipleDataBases.model.user.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
