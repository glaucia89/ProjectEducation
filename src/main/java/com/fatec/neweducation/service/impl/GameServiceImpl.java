package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.GameDAO;
import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.service.GameService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDAO dao;

    @Override
    public void saveGame(Game game) {
        game.setDate(new Date());
        dao.save(game);

    }

    @Override
    public void updateGame(Game game) {
        dao.update(game);

    }

    @Override
    public void deleteGame(Game game) {
        dao.delete(game);

    }

    @Override
    public List<Game> findAllGames() {
        return dao.findAll();
    }

    @Override
    //TODO melhor jeito para pesquisar por 1 atributo
    public List<Game> findGameByUser(User user) {
        return null;
    }
}
