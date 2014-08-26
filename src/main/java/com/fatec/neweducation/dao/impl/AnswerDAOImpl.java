package com.fatec.neweducation.dao.impl;

import com.fatec.neweducation.dao.AnswerDAO;
import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

/**
 * Created by glaucia on 14/08/14.
 */
@Component
public class AnswerDAOImpl implements AnswerDAO {

    
    private Session session;


    @Override
    public Answer getById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Answer entity = (Answer) session.get(Answer.class, id);
        tx.commit();
        return entity;
    }

    @Override
    public Integer save(Answer entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(entity);
        tx.commit();
        return id;
    }

    @Override
    public void update(Answer entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public void delete(Answer entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();

    }

    @Override
    public List<Answer> findAll() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Answer> list = session.createSQLQuery("select {answer.*} from answer").addEntity("answer", Answer.class).list();
        tx.commit();
        return list;
    }

}
