package com.fatec.neweducation.service;

import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import java.util.List;

/**
 * Created by glaucia on 09/07/14.
 */
public interface AnswerService {

    public void saveAnswer(Answer answer);

    public void deleteAnswer(Answer answer);

    public void updateAnswer(Answer answer);

    public Answer findAnswerById(Integer id);

    public List<Answer> findAnswerByQuestion(Question question);
}
