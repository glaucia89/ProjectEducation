package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.QuestionDAO;
import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.model.resources.TypeQuestion;
import com.fatec.neweducation.service.AnswerService;
import com.fatec.neweducation.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDAO dao;

    private AnswerService answerService;

    @Override
    public void save(Question question) {
        dao.save(question);
    }

    @Override
    public void delete(Integer id) {
        Question question = this.findById(id);
        dao.delete(question);
    }

    @Override
    public void update(Question question) {
        dao.update(question);
        List<Answer> listAnswer;
        listAnswer = answerService.findByQuestion(question);
        for (Answer answer : listAnswer) {
            answerService.update(answer);
        }
    }

    @Override
    public Question findById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<Question> findByFAE(TypeQuestion type) {
        String query = "from " + Question.class.getName() + " q where q.typeQuestion = '" + type + "'";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<Question> findByHability(Hability hability) {
        String query = "from " + Question.class.getName() + " q where q.hability = '" + hability + "'";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<Question> findByDifficulty(Integer difficulty) {
        String query = "from " + Question.class.getName() + " q where q.difficulty = " + difficulty;
        return this.dao.executeQuery(query);
    }
}
