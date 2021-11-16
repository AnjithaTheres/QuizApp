package com.example.QuizApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuizApp.entities.Question;




@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/questions")
public class QuestionController {
	
	@Autowired
	QuestionRepository questionRepository;
	
	@GetMapping("/")
	public List<Question> fetchAllQuestions(){
		return questionRepository.findAll();
	}
	
	@PostMapping("/")
	public  ResponseEntity<Void>  addQuestion(@RequestBody Question question){
		questionRepository.save(question);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;
	}
//	@RequestMapping(path = "/questions/{questionid}", method = RequestMethod.DELETE)
	@DeleteMapping("/{questionid}")
	public void deleteQuestion(@PathVariable("questionid") int questionId){
		System.out.println(questionId);
		System.out.println("Delete");
		questionRepository.deleteById(questionId);
	}
	
}

