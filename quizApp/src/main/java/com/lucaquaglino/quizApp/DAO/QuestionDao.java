package com.lucaquaglino.quizApp.DAO;

import com.lucaquaglino.quizApp.Entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
List<Question> findByCategory(String category);



}
