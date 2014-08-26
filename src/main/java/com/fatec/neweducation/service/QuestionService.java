package com.fatec.neweducation.service;

import com.fatec.neweducation.model.Question;

/**
 * Created by glaucia on 31/07/14.
 */
public interface QuestionService {

    public void saveQuestion(Question question);

    public void deleteQuestion(Question question);

    public void updateQuestion(Question question);

    public Question findQuestionById(Integer id);

}
