package com.linying.service.impl;

import com.linying.dao.StudentDao;
import com.linying.dao.UserDao;
import com.linying.entity.Student;
import com.linying.entity.User;
import com.linying.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linying on 2017/3/27
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private UserDao userDao;

    public List<Student> getAllStudent() {
        return studentDao.findAll();
    }

    public List<User> getUser(){
        return userDao.findAll();
    }
}
