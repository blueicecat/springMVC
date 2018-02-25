package com.linying.service;

import com.linying.entity.Student;
import com.linying.entity.User;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    List<User> getUser();
}
