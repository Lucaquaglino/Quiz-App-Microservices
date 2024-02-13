package com.lucaquaglino.quizApp.Service;

import com.lucaquaglino.quizApp.DAO.QuestionDao;
import com.lucaquaglino.quizApp.Entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    //RECUPERO TUTTTE LE DOMANDE
    public List<Question> getAllQuestions() {
       return questionDao.findAll();
    }
    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
         questionDao.save(question);
return "success";
    }
}

