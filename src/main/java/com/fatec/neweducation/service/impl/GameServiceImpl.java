package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.GameDAO;
import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.service.GameService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
@Transactional
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDAO dao;

    @Override
    public void save(Game game) {
        game.setCreationDate(new Date());
        dao.save(game);

    }

    @Override
    public void update(Game game) {
        dao.update(game);

    }

    @Override
    public void delete(Integer id) {
        Game game = this.findById(id);
        dao.delete(game);

    }

    @Override
    public List<Game> findAll() {
        return dao.findAll();
    }

    @Override
    //TODO melhor jeito para pesquisar por 1 atributo
    public List<Game> findByUser(User user) {
        return null;
    }

    @Override
    public Game findById(Integer id) {
        return dao.getById(id);
    }
}
