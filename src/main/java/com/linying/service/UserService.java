package com.linying.service;

import com.linying.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(Long id ,String name);

    void delete(Long id);

}
