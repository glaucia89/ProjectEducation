package com.fatec.neweducation.service;


import com.fatec.neweducation.model.School;
import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface SchoolService {

    public void saveSchool(School school);

    public void deleteSchool(School school);

    public void updateSchool(School school);

    public School findSchoolById(Integer id);

    public List<School> findAll();

    public void deleteSchoolbyId(Integer id);
}
