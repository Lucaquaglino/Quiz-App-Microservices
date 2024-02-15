package com.lucaquaglino.quizApp.DAO;

import com.lucaquaglino.quizApp.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
