package com.linying.service.impl;

import com.linying.dao.UserDao;
import com.linying.entity.User;
import com.linying.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public List<User> findAll() {
        return userDao.findAll();
    }

    public User save(Long id, String name) {
        User user;
        if (id != null) {
            user = userDao.findOne(id);
        } else {
            user = new User();
        }
        user.setName(name);
        user = userDao.save(user);
        return user;
    }

    public void delete(Long id) {
        userDao.delete(id);
    }
}
