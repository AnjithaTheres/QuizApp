package com.example.QuizApp.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuizApp.entities.User;



@RestController
@CrossOrigin

public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public List<com.example.QuizApp.entities.User> fetchAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/users") 
	public User user(@RequestBody User user) throws Exception { 
		System.out.println("User method is invoked.. ");
				
	User user_obj= null; 
	String temp_username= user.getUsername();
	String temp_password= user.getPassword(); 
	if(temp_username != null && temp_password !=null){ 
		user_obj= userRepository.findBy_usernameAndpassword(temp_username, temp_password); 
		System.out.println("Login Token : "+user_obj); } 
	if(user_obj==null){ throw new Exception("Invalid Credentials"); } 
	return user_obj; 
	}

}