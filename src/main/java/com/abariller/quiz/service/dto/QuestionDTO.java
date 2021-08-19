package com.abariller.quiz.service.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class QuestionDTO {

    private String entitled;
    private String[] suggestions;
}
