package com.example.QuizApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int qid;
	  

	  String title;
	   String description ;
	   int maxMarks;
	   int NumberofQuestions;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	public int getNumberofQuestions() {
		return NumberofQuestions;
	}
	public void setNumberofQuestions(int numberofQuestions) {
		NumberofQuestions = numberofQuestions;
	}
	   
}