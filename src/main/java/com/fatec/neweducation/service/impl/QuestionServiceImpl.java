package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.QuestionDAO;
import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.service.AnswerService;
import com.fatec.neweducation.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDAO dao;

    private AnswerService answerService;

    @Override
    public void saveQuestion(Question question) {
        dao.save(question);
    }

    @Override
    public void deleteQuestion(Question question) {
        dao.delete(question);
    }

    @Override
    public void updateQuestion(Question question) {
        dao.update(question);
        List<Answer> listAnswer;
        listAnswer = answerService.findAnswerByQuestion(question);
        for (Answer answer : listAnswer) {
            answerService.updateAnswer(answer);
        }
    }

    @Override
    public Question findQuestionById(Integer id) {
        return dao.getById(id);
    }
}
