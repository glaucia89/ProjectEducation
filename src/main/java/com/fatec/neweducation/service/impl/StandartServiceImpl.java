package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.StandartDAO;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.Standart;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.service.StandartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
@Transactional
public class StandartServiceImpl implements StandartService {

    @Autowired
    protected StandartDAO dao;

    public StandartServiceImpl() {
    }

    @Override
    public void save(Standart standart) {
        dao.save(standart);
    }

    @Override
    public void delete(Standart standart) {
        dao.delete(standart);
    }

    @Override
    public void update(Standart standart) {
        dao.update(standart);
    }

    @Override
    public Standart findById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<Standart> findAll() {
        return dao.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        Standart standart = dao.getById(id);
        dao.delete(standart);
    }

    @Override
    public List<Standart> findByPlayer(Player player) {
        String query = "from " + Standart.class.getName() + " s where s.fkPlayer.id = " + player.getId();
        return this.dao.executeQuery(query);
    }
}
