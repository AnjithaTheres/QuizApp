package com.example.QuizApp.Controllers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.QuizApp.entities.User;





public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("SELECT n from #{#entityName} n WHERE n.username = ?1 and n.password= ?2") 
	public User findBy_usernameAndpassword(String username, String password); }
