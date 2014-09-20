package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.UserDAO;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.TypeUser;
import com.fatec.neweducation.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO dao;

    @Override
    //TODO - incluir mensagem de erro
    public Integer save(User user) {
        if (this.isAvailableName(user.getNameUser())) {
            Integer id = dao.save(user);
            return id;
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        User user = this.findById(id);
        dao.delete(user);
    }

    @Override
    public void update(User user) {
        dao.update(user);

    }

    @Override
    public User findById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    public boolean isAvailableName(String name) {
        User userFind = this.findByName(name);
        if (userFind != null) {
            return false;
        }
        return true;
    }

    @Override
    public List<User> findByType(TypeUser type) {
        String query = "from " + User.class.getName() + " u where u.typeUser = '" + type + "'";
        return this.dao.executeQuery(query);
    }
}
