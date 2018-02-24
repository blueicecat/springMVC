package com.linying.dao;

import com.linying.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linying on 2017/3/27
 */
@Repository("studentDao")
public class StudentDao {

    public List<Student> findAll() {
        List<Student> all = new ArrayList<Student>();
        all.add(new Student("1", "tom", 18, true));
        all.add(new Student("2", "cat", 28, true));
        all.add(new Student("3", "linying", 18, true));
        all.add(new Student("3", "李学凯", 18, true));
        all.add(new Student("4", "cms", 18, true));
        return all;
    }
}
