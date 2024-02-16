package com.lucaquaglino.quizservice.DAO;


import com.lucaquaglino.quizservice.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
