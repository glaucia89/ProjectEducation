package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.PlayerSchoolGrade;
import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface PlayerSchoolGradeDAO {

    public PlayerSchoolGrade getById(Integer id);

    public Integer save(PlayerSchoolGrade entity);

    public void update(PlayerSchoolGrade entity);

    public void delete(PlayerSchoolGrade entity);

    public List<PlayerSchoolGrade> findAll();

    public List<PlayerSchoolGrade> findByPlayer(Integer id);
}
