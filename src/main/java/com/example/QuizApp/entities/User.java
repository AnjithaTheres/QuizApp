package com.example.QuizApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		String username;
		String emailaddress;
		String password;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmailaddress() {
			return emailaddress;
		}
		public void setEmailaddress(String emailaddress) {
			this.emailaddress = emailaddress;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}