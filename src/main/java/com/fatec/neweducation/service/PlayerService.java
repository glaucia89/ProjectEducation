package com.fatec.neweducation.service;


import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.User;
import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface PlayerService {

    public Integer savePlayer(Player player);

    public void deletePlayer(Player player);

    public void updatePlayer(Player player);

    public List<Player> findAll();

    public Player findPlayerById(Integer id);

    public Player findPlayerByUser(User user);
}
