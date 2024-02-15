package com.lucaquaglino.quizApp.Controller;

import com.lucaquaglino.quizApp.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("quiz")
public class QuizController
{
@Autowired
QuizService quizService;

@PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam  int numQ,@RequestParam  String title){
        return quizService.createQuiz(category, numQ, title);
    }
}
