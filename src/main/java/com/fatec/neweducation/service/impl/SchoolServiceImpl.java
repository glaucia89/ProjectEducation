package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.SchoolDAO;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.service.SchoolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
@Transactional
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    protected SchoolDAO dao;

    public SchoolServiceImpl() {
    }

    @Override
    public void saveSchool(School school) {
        dao.save(school);
    }

    @Override
    public void deleteSchool(School school) {
        dao.delete(school);
    }

    @Override
    public void updateSchool(School school) {
        dao.update(school);
    }

    @Override
    public School findSchoolById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<School> findAll() {
        return dao.findAll();
    }

    @Override
    public void deleteSchoolbyId(Integer id) {
        School school = dao.getById(id);
        dao.delete(school);
    }
}
