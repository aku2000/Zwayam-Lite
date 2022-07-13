package com.zwayamLite.ZwayamLite.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwayamLite.ZwayamLite.Models.Users;
import com.zwayamLite.ZwayamLite.Repository.UsersRepository;

@Service
public class UsersSevice {


	
	private UsersRepository usersRepository;
	
	// to register the user
	public Users addUser(Users users) {
		return usersRepository.save(users);
	}
	
	// helps to find user by email
	public Users getUserByEmail(String email) {
		return usersRepository.findByEmail(email);
	}
}
