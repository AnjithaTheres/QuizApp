package com.example.QuizApp.Controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.QuizApp.entities.Question;




public interface QuestionRepository extends JpaRepository<Question, Integer>{
Question findById(int id);
}
