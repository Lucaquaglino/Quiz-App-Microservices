package com.lucaquaglino.quizApp.Service;

import com.lucaquaglino.quizApp.DAO.QuestionDao;
import com.lucaquaglino.quizApp.Entity.Question;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    private static final Logger logger = LoggerFactory.getLogger(QuestionService.class);
    @Autowired
    QuestionDao questionDao;

    //RECUPERO TUTTTE LE DOMANDE
    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Errore durante il recupero di tutte le domande", e);
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
    //RECUPERO LE DOMANDE PER CATEGORIA
    public ResponseEntity<List<Question>> getQuestionByCategory(String category) {
        try {
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Errore durante il recupero delle domande per la categoria: {}", category, e);
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
    //AGGIUNGO NUOVE DOMANDE
    public ResponseEntity<String> addQuestion(Question question) {
        try {
            questionDao.save(question);
            return new ResponseEntity<>("success", HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Errore durante l'aggiunta della domanda", e);
        }
        return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST);
    }
}

