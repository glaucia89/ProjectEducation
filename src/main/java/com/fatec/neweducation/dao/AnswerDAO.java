package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.Answer;
import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface AnswerDAO {

    public Answer getById(Integer id);

    public Integer save(Answer entity);

    public void update(Answer entity);

    public void delete(Answer entity);

    public List<Answer> findAll();

    public List<Answer> executeQuery(String query);
}
