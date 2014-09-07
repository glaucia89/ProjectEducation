package com.fatec.neweducation.service;

import com.fatec.neweducation.model.Question;

/**
 * Created by glaucia on 31/07/14.
 */
public interface QuestionService {

    public void save(Question question);

    public void delete(Integer id);

    public void update(Question question);

    public Question findById(Integer id);

}
