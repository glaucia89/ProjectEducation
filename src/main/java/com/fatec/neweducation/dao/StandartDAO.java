package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.Standart;
import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface StandartDAO {

    public Standart getById(Integer id);

    public Integer save(Standart entity);

    public void update(Standart entity);

    public void delete(Standart entity);

    public List<Standart> findAll();

    public List<Standart> executeQuery(String query);
}
