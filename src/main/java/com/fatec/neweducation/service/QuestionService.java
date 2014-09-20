package com.fatec.neweducation.service;

import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.model.resources.TypeQuestion;
import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface QuestionService {

    public void save(Question question);

    public void delete(Integer id);

    public void update(Question question);

    public Question findById(Integer id);

    public List<Question> findByFAE(TypeQuestion type);

    public List<Question> findByHability(Hability hability);

    public List<Question> findByDifficulty(Integer difficulty);

}
