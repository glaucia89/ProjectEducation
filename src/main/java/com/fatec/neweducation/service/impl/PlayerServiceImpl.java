package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.PlayerDAO;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.service.PlayerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDAO dao;

    @Override
    public void savePlayer(Player player) {
        dao.save(player);
    }

    @Override
    public void deletePlayer(Player player) {
        dao.delete(player);

    }

    @Override
    public void updatePlayer(Player player) {
        dao.update(player);
    }

    @Override
    public List<Player> findAll() {
        return dao.findAll();
    }

    @Override
    public Player findPlayerById(Integer id) {
        return dao.getById(id);
    }

    @Override
    //TODO
    public Player findPlayerByUser(User user) {
        return null;
    }
}
