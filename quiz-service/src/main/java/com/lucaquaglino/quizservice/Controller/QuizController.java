package com.lucaquaglino.quizservice.Controller;


import com.lucaquaglino.quizservice.Entity.QuestionWrapper;
import com.lucaquaglino.quizservice.Entity.QuizDto;
import com.lucaquaglino.quizservice.Service.QuizService;
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
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto){
        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumQuestions(), quizDto.getTitle());
    }


    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@PathVariable Integer id){
   return quizService.getQuizQuestions(id);

    }

/*    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
    return quizService.calculateResult(id, responses);
    }*/
}
