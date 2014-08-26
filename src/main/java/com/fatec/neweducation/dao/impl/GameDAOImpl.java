package com.fatec.neweducation.dao.impl;

import com.fatec.neweducation.dao.GameDAO;
import com.fatec.neweducation.model.Game;
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
public class GameDAOImpl implements GameDAO {

    private Session session;

    @Override
    public Game getById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Game entity = (Game) session.get(Game.class, id);
        tx.commit();
        return entity;
    }

    @Override
    public Integer save(Game entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(entity);
        tx.commit();
        return id;
    }

    @Override
    public void update(Game entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public void delete(Game entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
    }

    @Override
    public List<Game> findAll() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Game> list = session.createSQLQuery("select {game.*} from game").addEntity("game", Game.class).list();
        tx.commit();
        return list;
    }
}
