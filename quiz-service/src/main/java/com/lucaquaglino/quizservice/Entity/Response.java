package com.lucaquaglino.quizApp.Entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data

public class Response {
    private Integer id;
    private String response;
}
