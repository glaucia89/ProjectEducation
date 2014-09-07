package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.PlayerSchoolGradeDAO;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
@Transactional
public class PlayerSchoolGradeServiceImpl implements PlayerSchoolGradeService {

    @Autowired
    private PlayerSchoolGradeDAO dao;

    @Override
    public Integer save(PlayerSchoolGrade playerSchoolGrade) {
        Integer id = dao.save(playerSchoolGrade);
        return id;
    }

    @Override
    public void update(PlayerSchoolGrade playerSchoolGrade) {
        dao.update(playerSchoolGrade);

    }

    @Override
    public void delete(Integer id) {
        PlayerSchoolGrade playerSchoolGrade = this.findById(id);
        dao.update(playerSchoolGrade);

    }

    @Override
    public List<PlayerSchoolGrade> findAll() {
        return dao.findAll();

    }

    @Override
    //TODO
    public List<PlayerSchoolGrade> findByPlayer(Player player) {
        return null;
    }

    @Override
    public PlayerSchoolGrade findById(Integer id) {
        PlayerSchoolGrade psg = dao.getById(id);
        return psg;
    }
}
