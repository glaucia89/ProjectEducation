package com.fatec.neweducation.service;


import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.Hability;
import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface GameService {

    public void save(Game game);

    public void update(Game game);

    public void delete(Integer id);

    public Game findById(Integer id);

    public List<Game> findAll();

    public List<Game> findByUser(User user);

    public List<Game> findByUserAndHability(User user, Hability hability);

    public List<Game> findByUserAndHabilityIsCorrect(User user, Hability hability);

}
