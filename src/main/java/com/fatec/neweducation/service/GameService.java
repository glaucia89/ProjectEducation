package com.fatec.neweducation.service;


import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.model.User;
import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface GameService {

    public void saveGame(Game game);

    public void updateGame(Game game);

    public void deleteGame(Game game);

    public List<Game> findAllGames();

    public List<Game> findGameByUser(User user);

}
