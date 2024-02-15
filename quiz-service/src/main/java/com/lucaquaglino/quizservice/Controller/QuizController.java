package com.lucaquaglino.quizservice.Controller;

import com.lucaquaglino.quizApp.Entity.QuestionWrapper;
import com.lucaquaglino.quizApp.Entity.Response;
import com.lucaquaglino.quizApp.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@PathVariable Integer id){
   return quizService.getQuizQuestions(id);

    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
    return quizService.calculateResult(id, responses);
    }
}
