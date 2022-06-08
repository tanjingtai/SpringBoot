package com.bdqn.service;

import com.bdqn.pojo.User;

import java.util.List;

public interface UserService {
    List<User>list();
    void addUser(User user);
    void delete(int id);
    User findUserById(int id);
    void update(User user);
}
