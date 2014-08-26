package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.Question;
import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface QuestionDAO {

    public Question getById(Integer id);

    public Integer save(Question entity);

    public void update(Question entity);

    public void delete(Question entity);

    public List<Question> findAll();
}
