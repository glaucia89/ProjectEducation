package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.Player;
import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface PlayerDAO {

    public Player getById(Integer id);

    public Integer save(Player entity);

    public void update(Player entity);

    public void delete(Player entity);

    public List<Player> findAll();

    public List<Player> findByUser(Integer id);
}
