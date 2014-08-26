package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.Game;
import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface GameDAO {

    public Game getById(Integer id);

    public Integer save(Game entity);

    public void update(Game entity);

    public void delete(Game entity);

    public List<Game> findAll();
}
