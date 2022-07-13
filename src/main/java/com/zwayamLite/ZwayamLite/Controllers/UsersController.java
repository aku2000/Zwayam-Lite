package com.zwayamLite.ZwayamLite.Controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zwayamLite.ZwayamLite.Models.Users;
import com.zwayamLite.ZwayamLite.Repository.UsersRepository;
import com.zwayamLite.ZwayamLite.Services.UsersSevice;

import ch.qos.logback.core.net.LoginAuthenticator;

@RestController
public class UsersController {

	
	
	private UsersSevice usersService;
	
	//private UsersRepository UsersRepository;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to home page";
	}
	
	//register user
	@PostMapping("/register")
	public String addUsers(@RequestBody Users users) {
		String currEmail = users.getEmail();
		if(isValid(currEmail)) {
			// check whether is there any account exist with current email
			if(usersService.getUserByEmail(currEmail)==null) {
				// create the user
				usersService.addUser(users);
				return "Users added successfully";
			}else {
				// user already exist
				return "User already exist";
			}
			
		}else {
			return "Incorrect email format";
		}
	}
	
	
	// regex for verifying email
	public boolean isValid(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }
	
	
	// login users
	@PostMapping("/login")
	public String Authentication(@RequestBody Users user) {
		
		String tempEmail = user.getEmail();
		String tempPassword = user.getPassword();
		
		// verifying whether user exist or not
		
		try {
			Users currUsers = usersService.getUserByEmail(tempEmail);
			
			if(currUsers != null) {
				// check for password
				if(tempPassword.equals(currUsers.getPassword())) {
					// user verified
					return "login Successfull";
				}else {
					// unverified user
					return "Invalid Credentials";
				}
			}
		} catch (NullPointerException e) {}
		
		
		return "Account does not exists";
	}
	
	
	//get list of all users
//	@GetMapping("/users")
//	public List<Users> getAllUsers(){
//		return ;
//	}
}
