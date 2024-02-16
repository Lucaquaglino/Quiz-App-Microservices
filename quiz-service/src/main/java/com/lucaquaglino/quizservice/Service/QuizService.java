package com.lucaquaglino.quizservice.Service;


import com.lucaquaglino.quizservice.DAO.QuizDao;
import com.lucaquaglino.quizservice.Entity.Question;
import com.lucaquaglino.quizservice.Entity.QuestionWrapper;
import com.lucaquaglino.quizservice.Entity.Quiz;
import com.lucaquaglino.quizservice.Entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService{
@Autowired
QuizDao quizDao;



    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
   //   List<Integer> questions = // call the generate url RestTemplate http://localhost:8080/question/generate
      /*    Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);*/

        return new ResponseEntity<>("success", HttpStatus.CREATED);

    }


    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
  /*       Optional<Quiz> quiz = quizDao.findById(id);
         List<Question> questionFromDB = quiz.get().getQuestions();
         List<QuestionWrapper> questionsFromUser = new ArrayList<>();
for(Question q : questionFromDB){
    QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(),q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
    questionsFromUser.add(qw);
}*/
        List<QuestionWrapper> questionsFromUser = new ArrayList<>();
         return new ResponseEntity<>(questionsFromUser, HttpStatus.OK);
    }


    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
        List<Question> questions =quiz.getQuestions();
        int right= 0;
        int i = 0;
        for(Response response : responses){
            if(response.getResponse().equals(questions.get(i).getRightAnswer())) {
                right++;
            }
                i++;
            }

        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
