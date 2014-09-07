package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.User;
import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface UserDAO {

    public User getById(Integer id);

    public Integer save(User entity);

    public void update(User entity);

    public void delete(User entity);

    public List<User> findAll();

    public List<User> findByType(String type);
}
