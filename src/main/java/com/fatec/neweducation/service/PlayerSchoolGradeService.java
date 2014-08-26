package com.fatec.neweducation.service;


import com.fatec.neweducation.model.PlayerSchoolGrade;
import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface PlayerSchoolGradeService {

    public void savePlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade);

    public void updatePlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade);

    public void deletePlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade);

    public List<PlayerSchoolGrade> findAllPSG();

    public List<PlayerSchoolGrade> findPSGByPlayer();
}
