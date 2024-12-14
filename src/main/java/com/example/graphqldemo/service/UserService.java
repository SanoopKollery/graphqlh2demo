package com.example.graphqldemo.service;

import com.example.graphqldemo.model.User;

import java.util.List;
import java.util.UUID;

/*
 * @project GraphqlDemo
 * @author Sanoop Kollery
 */
public interface UserService {

    User save(User user)throws Exception;
    Boolean update(User user) throws Exception;
    Boolean delete(int userId) throws Exception;
    User get(int userId) throws Exception;
    List<User> getAll()throws Exception;
}
