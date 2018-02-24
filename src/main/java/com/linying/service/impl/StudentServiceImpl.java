package com.linying.service.impl;

import com.linying.dao.StudentDao;
import com.linying.entity.Student;
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

    public List<Student> getAllStudent() {
        return studentDao.findAll();
    }
}
