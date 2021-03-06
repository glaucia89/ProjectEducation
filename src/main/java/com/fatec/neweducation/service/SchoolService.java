package com.fatec.neweducation.service;


import com.fatec.neweducation.model.School;
import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface SchoolService {

    public void save(School school);

    public void delete(School school);

    public void update(School school);

    public School findById(Integer id);

    public List<School> findAll();

    public void deleteById(Integer id);
}
