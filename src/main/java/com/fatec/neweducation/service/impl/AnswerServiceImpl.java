package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.AnswerDAO;
import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.service.AnswerService;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by glaucia on 09/07/14.
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDAO dao;

    @Override
    public void saveAnswer(Answer answer) {
        dao.save(answer);

    }

    @Override
    public void deleteAnswer(Answer answer) {
        dao.delete(answer);
    }

    @Override
    public void updateAnswer(Answer answer) {
        dao.update(answer);

    }

    @Override
    public Answer findAnswerById(Integer id) {
        Answer answer = dao.getById(id);
        return answer;
    }

    @Override
    //Preciso verificar como fazer ... acho que deve existir um jeito mais fácil do que montar um SQL
    public List<Answer> findAnswerByQuestion(Question question) {
        List<Answer> listAnswer = new LinkedList<Answer>();
        return listAnswer;
    }

}
