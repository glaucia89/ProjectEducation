package com.fatec.neweducation.dao.impl;

import com.fatec.neweducation.dao.SchoolDAO;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 * Created by glaucia on 14/08/14.
 */
@Repository
public class SchoolDAOImpl implements SchoolDAO {

    private Session session;

    public SchoolDAOImpl() {
    }

    @Override
    public School getById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        School entity = (School) session.get(School.class, id);
        tx.commit();
        return entity;
    }

    @Override
    public Integer save(School entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(entity);
        tx.commit();
        return id;
    }

    @Override
    public void update(School entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public void delete(School entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
    }

    @Override
    public List<School> findAll() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<School> list = session.createSQLQuery("select {school.*} from school").addEntity("school", School.class).list();
        tx.commit();
        return list;
    }


}
