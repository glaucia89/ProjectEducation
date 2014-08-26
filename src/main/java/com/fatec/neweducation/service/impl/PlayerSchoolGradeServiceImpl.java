package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.PlayerSchoolGradeDAO;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class PlayerSchoolGradeServiceImpl implements PlayerSchoolGradeService {

    @Autowired
    private PlayerSchoolGradeDAO dao;

    @Override
    public void savePlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {
        dao.save(playerSchoolGrade);
    }

    @Override
    public void updatePlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {
        dao.update(playerSchoolGrade);

    }

    @Override
    public void deletePlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {
        dao.update(playerSchoolGrade);

    }

    @Override
    public List<PlayerSchoolGrade> findAllPSG() {
        return dao.findAll();

    }

    @Override
    //TODO
    public List<PlayerSchoolGrade> findPSGByPlayer() {
        return null;
    }
}
