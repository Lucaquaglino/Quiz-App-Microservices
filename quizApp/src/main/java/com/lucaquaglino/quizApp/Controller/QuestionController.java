package com.lucaquaglino.quizApp.Controller;

import com.lucaquaglino.quizApp.Entity.Question;
import com.lucaquaglino.quizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;


    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){
            return questionService.getQuestionByCategory(category);
    }
@PostMapping("add")
    public String addQuestion(@RequestBody Question question){
return questionService.addQuestion(question);

    }


    @


}
