package com.fatec.neweducation.service;


import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.User;
import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface PlayerService {

    public Integer save(Player player);

    public void delete(Integer id);

    public void update(Player player);

    public List<Player> findAll();

    public Player findById(Integer id);

    public List<Player> findByUser(User user);
}
