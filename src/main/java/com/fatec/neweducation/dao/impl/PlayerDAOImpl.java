package com.fatec.neweducation.dao.impl;

import com.fatec.neweducation.dao.PlayerDAO;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by glaucia on 14/08/14.
 */
@Component
//@Transactional
public class PlayerDAOImpl implements PlayerDAO {

    private Session session;

    @Override
    public Player getById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Player entity = (Player) session.get(Player.class, id);
        tx.commit();
        return entity;
    }

    @Override
    public Integer save(Player entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(entity);
        tx.commit();
        return id;
    }

    @Override
    public void update(Player entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public void delete(Player entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
    }

    @Override
    public List<Player> findAll() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Player> list = session.createSQLQuery("select {player.*} from player").addEntity("player", Player.class).list();
        tx.commit();
        return list;
    }
}
