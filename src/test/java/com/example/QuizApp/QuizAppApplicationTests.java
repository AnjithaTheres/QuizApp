package com.example.QuizApp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.QuizApp.Controllers.QuestionRepository;
import com.example.QuizApp.entities.Question;

@SpringBootTest
class QuizAppApplicationTests {
@Autowired
private QuestionRepository questionRepository;
	
	//@Test
	public void TestCreateQuestion() {
		Question question1 = new Question();
		question1.setId(13);
		question1.setQuestion(" In which process, a local variable has the same name as one of the instance variables?");
		question1.setOption1("Serialization");
		question1.setOption2("Variable Shadowing");
		question1.setOption3("Abstraction");
		question1.setOption4("Line feed");
		question1.setAnswer("Multi-threading");
		questionRepository.save(question1);
		assertNotNull(questionRepository.findById(13).get());
		
		
	}
	//@Test
	
	public void TestReadQuestion() {
		List<Question> list = questionRepository.findAll();
		System.out.println(list);
		System.out.println(list.size());
		assertSame(3,questionRepository.findAll().size());
		
	}
	@Test

	public void testDelete () {
		Question question = questionRepository.findById(21);
		questionRepository.deleteById(question.getId());
		
		Question deletedQuestion = questionRepository.findById(21);
		assertNull(deletedQuestion);
				
		
	
	}   
		
	//@Test
	public void testGet() {
	    System.out.println("Running testGet...");
	     
	    Integer id = 12;
	     
	   Question question =questionRepository.findById(12);
	     
	    assertEquals(12, question.getId());      
	}	
	}

