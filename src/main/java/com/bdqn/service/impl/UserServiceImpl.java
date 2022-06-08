package com.bdqn.service.impl;

import com.bdqn.dao.UserMapper;
import com.bdqn.pojo.User;
import com.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        List<User>list=userMapper.list();
        return list;
    }

    @Override
    public void addUser(User user) {
    userMapper.addUser(user);
    }

    @Override
    public void delete(int id) {
    userMapper.delete(id);
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void update(User user) {
    userMapper.update(user);
    }
}
